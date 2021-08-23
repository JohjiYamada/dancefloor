package sg.JohjiYamada.WoodenTag.service.system;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.JohjiYamada.WoodenTag.entity.Enum.SelectionEnum;

@Service
public class SelectionService {

	private static final String PACKAGE_NAME = "sg.JohjiYamada.WoodenTag.entity.Enum";
	
	@SuppressWarnings("unchecked")
	public List<SelectionEnum<? extends SelectionEnum<?>>> getSelectionList(String className) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		
		Class<? extends SelectionEnum<?>>  clazz =  (Class<? extends SelectionEnum<?>> ) Class.forName(PACKAGE_NAME + '.' + className);
		Method m = clazz.getInterfaces()[0].getDeclaredMethod("getOrderedList", Class.class);
		Object result = m.invoke(clazz, clazz);
		List<SelectionEnum<? extends SelectionEnum<?>>> result2 = (List<SelectionEnum<? extends SelectionEnum<?>>>) result;
		return result2;
	}

}
