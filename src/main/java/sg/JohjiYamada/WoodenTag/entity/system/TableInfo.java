package sg.JohjiYamada.WoodenTag.entity.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//SELECT  table_name, column_name,ordinal_position,nullable, type_name FROM INFORMATION_SCHEMA.COLUMNS where table_schema = 'PUBLIC'


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TableInfo {
	
	private String tableName;
	private String columnName;
	private Integer ordinalPosition;
	private Integer nullable;
	private String typeName;
}
