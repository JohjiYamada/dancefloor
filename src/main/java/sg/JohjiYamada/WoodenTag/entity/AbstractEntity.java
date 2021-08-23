package sg.JohjiYamada.WoodenTag.entity;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.Data;
import lombok.NoArgsConstructor;
import sg.JohjiYamada.WoodenTag.Util.ColumnDef;
import sg.JohjiYamada.WoodenTag.Util.EnumColumnType;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractEntity<ENTITY extends AbstractEntity<?>> {
	
//	@Transient
//	private boolean validationError;
//
	@Transient
	private Map<String, List<String>> errorDetails;

	@Id
	@GeneratedValue
	@ColumnDef(caption = "ID", type = EnumColumnType.ID, length = 19, columnOrder = 0)
	private Long id;

	@ColumnDef(caption = "更新日付", type = EnumColumnType.PRC_DATE, length = 17, columnOrder = 10000)
	private Timestamp prcDate;

	@ColumnDef(caption = "更新者", type = EnumColumnType.PRC_USER, length = 100, columnOrder = 10001)
	private String prcUserCode;

	@ColumnDef(caption = "作成日付", type = EnumColumnType.PRC_DATE, length = 17, columnOrder = 10002, show = false)
	private Timestamp createDate;

	@ColumnDef(caption = "作成者", type = EnumColumnType.PRC_USER, length = 100, columnOrder = 10003, show = false)
	private String createUserCode;

	public void setFieldsForUpdate(ENTITY entity) {
		List<Field> fieldList = Arrays.asList(entity.getClass().getDeclaredFields());
		for (Field field : fieldList) {
			field.setAccessible(true);
			try {
				field.set(this, field.get(entity));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	};
	
}
