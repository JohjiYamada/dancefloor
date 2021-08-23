package sg.JohjiYamada.WoodenTag;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.JohjiYamada.WoodenTag.Util.ColumnDef;
import sg.JohjiYamada.WoodenTag.Util.PropertyUtils;
import sg.JohjiYamada.WoodenTag.Util.TableDef;
import sg.JohjiYamada.WoodenTag.entity.system.GridBase;
import sg.JohjiYamada.WoodenTag.entity.system.TableInfo;
import sg.JohjiYamada.WoodenTag.service.system.TableInfoService;

@Component
public class BootStrap {

	@Autowired
	private TableInfoService tableInfoService;
	
	public static Map<String, List<GridBase>> GRID_BASE_MAP;
	
	@PostConstruct
	public void initAfterStartup() throws ClassNotFoundException, IOException {
		List<Class<?>> entityList = getClasses();
		GRID_BASE_MAP = new ConcurrentHashMap<>();
		List<TableInfo> tableInfoList = tableInfoService.getTables();
		List<GridBase> columnList = null;
		for (TableInfo tableInfo : tableInfoList) {
			String key = tableInfo.getTableName().toLowerCase();
			if(GRID_BASE_MAP.get(key) == null) {
				columnList = new ArrayList<>();
				GRID_BASE_MAP.put(key, columnList); 
			} else {
				columnList = GRID_BASE_MAP.get(key);
			}
			GridBase gb = createGridBase(tableInfo, entityList);
			if(gb != null) {
				//TODO exceptionにして詳細出した方がいいかも
				columnList.add(gb);
			}
		}
		GRID_BASE_MAP.values().forEach((list) -> list.sort(Comparator.comparing(GridBase::getColumnOrder)));
		System.out.println(GRID_BASE_MAP);
	}
	
	private static GridBase createGridBase(TableInfo tableInfo, List<Class<?>> entityList) {
		String tableName = PropertyUtils.camelize(tableInfo.getTableName());
		String columnName = PropertyUtils.camelizeLowerCase(tableInfo.getColumnName());
		GridBase gb = null;
		for (Class<?> clazz : entityList) {
			if (clazz.getSimpleName().equals(tableName)) {
				Field f = null;
				try {
					f = clazz.getDeclaredField(columnName);
				} catch (NoSuchFieldException e) {
					try {
						f = clazz.getSuperclass().getDeclaredField(columnName);
//						if (f.getName() != "id") {
//							tableInfo.setOrdinalPosition(tableInfo.getOrdinalPosition() + 100000);
//						}
					} catch (NoSuchFieldException | SecurityException e1) {
						if(!StringUtils.endsWith(columnName, "Id")) {
							System.out.println("tableName: " + tableName + " columnName: " + columnName);
							e1.printStackTrace();
						}
					}
				}
				if (f != null) {
					ColumnDef c = f.getAnnotation(ColumnDef.class);
					TableDef t = clazz.getDeclaredAnnotation(TableDef.class);
					if(c != null && t != null) {
						gb = new GridBase();
						gb.setTableInfo(tableInfo);
						gb.setColumnDef(c);
						gb.setTableDef(t);
					}
					break;
				}
			}
		}
//		entityList.stream().forEach(clazz -> {
//			if (clazz.getSimpleName().equals(tableName)) {
//				List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
//				fields.stream().forEach(field -> {
//					if(field.getName().equals(columnName)) {
//						gb.setTableInfo(tableInfo);
//						gb.setColumnDef(field.getAnnotation(ColumnDef.class));
//						gb.setTableDef(clazz.getDeclaredAnnotation(TableDef.class));
//					}
//				});
//			}
//		});
		return gb;
	}
	
	
	private static final String PACKAGE = "sg.JohjiYamada.WoodenTag.entity";
	
	private static List<Class<?>> getClasses() throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if(classLoader != null){
			String path = PACKAGE.replace('.', '/');
			Enumeration<URL> resources = classLoader.getResources(path);
			List<File> dirs = new ArrayList<File>();
			while (resources.hasMoreElements()) {
				URL resource = resources.nextElement();
				String fileName = resource.getFile();
				String fileNameDecoded = URLDecoder.decode(fileName, "UTF-8");
				dirs.add(new File(fileNameDecoded));
			}
			List<Class<?>> classes = new ArrayList<Class<?>>();
			for (File directory : dirs) {
				classes.addAll(findClasses(directory, PACKAGE));
			}
			return classes;
		}
		return Collections.emptyList();
	} 

	private static List<Class<?>> findClasses(File directory, String packageName) throws ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			String fileName = file.getName();
			if (file.isDirectory()) {
				assert !fileName.contains(".");
				classes.addAll(findClasses(file, packageName + "." + fileName));
			} else if (fileName.endsWith(".class") && !fileName.contains("$")) {
				Class<?> _class;
				try {
					_class = Class.forName(packageName + '.'
							+ fileName.substring(0, fileName.length() - 6));
				} catch (ExceptionInInitializerError e) {
					// happen, for example, in classes, which depend on
					// Spring to inject some beans, and which fail,
					// if dependency is not fulfilled
					_class = Class.forName(packageName + '.'
							+ fileName.substring(0, fileName.length() - 6), false, Thread
							.currentThread().getContextClassLoader());
				}
				classes.add(_class);
			}
		}
		return classes;
	}
	
}
