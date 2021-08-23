package sg.JohjiYamada.WoodenTag.entity.system;

import lombok.Data;
import lombok.NoArgsConstructor;
import sg.JohjiYamada.WoodenTag.Util.ColumnDef;
import sg.JohjiYamada.WoodenTag.Util.EnumColumnType;
import sg.JohjiYamada.WoodenTag.Util.TableDef;

//SELECT  table_name, column_name,ordinal_position,nullable, type_name FROM INFORMATION_SCHEMA.COLUMNS where table_schema = 'PUBLIC'


@NoArgsConstructor
@Data
public class GridBase {
	
	private String tableName;
	private String columnName;
	private boolean nullable;
	private String dbTypeName;
	
	private String tableCaption;
	private String tableDescription;
	private boolean isSystem;
	
	private String caption;
	private EnumColumnType type;
	private int length;
	private boolean required;
	private Integer columnOrder;
	private boolean show;
	private String selectionEnum;
	
	public boolean isNumeric() {
		return (EnumColumnType.ID.equals(this.type) || 
				EnumColumnType.DECIMAL.equals(this.type) ||
				EnumColumnType.NUMBER.equals(this.type) ||
				EnumColumnType.PRICE.equals(this.type));
	}
	
	public void setTableInfo(TableInfo tableInfo) {
		if(tableInfo != null) {
			this.tableName = tableInfo.getTableName();
			this.columnName = tableInfo.getColumnName();
			this.nullable = (tableInfo.getNullable() == 0);
			this.dbTypeName = tableInfo.getTypeName();
		}
	}
	
	public void setTableDef(TableDef tableDef) {
		if(tableDef != null) {
			this.tableCaption = tableDef.caption();
			this.tableDescription = tableDef.description();
			this.isSystem = tableDef.isSystem();
		}
	}
	
	public void setColumnDef(ColumnDef columnDef) {
		if(columnDef != null) {
			this.caption = columnDef.caption();
			this.type = columnDef.type();
			this.length = columnDef.length();
			this.required = columnDef.required();
			this.columnOrder = columnDef.columnOrder();
			this.show = columnDef.show();
			this.selectionEnum = columnDef.selectionEnum();
		}
	}
}
