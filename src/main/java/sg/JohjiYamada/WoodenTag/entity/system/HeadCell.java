package sg.JohjiYamada.WoodenTag.entity.system;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import sg.JohjiYamada.WoodenTag.Util.EnumColumnType;
import sg.JohjiYamada.WoodenTag.Util.PropertyUtils;



@NoArgsConstructor
@Data
public class HeadCell implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String type;
	private boolean numeric;
	private String label;
	private String field;
	private DefaultStyle style;
	private boolean show;
	private String selectionEnum;
	
//	public static final Object DEF_STYLE = new Object() {
//		private String width = "350px";
//	};
	
	public static HeadCell createHeadCell(GridBase gb) {
		HeadCell hc = new HeadCell();
		hc.id = gb.getTableName() + "." + gb.getColumnName() + "_" + gb.getColumnOrder();
		hc.type = PropertyUtils.camelizeLowerCase(gb.getType().toString().toLowerCase());
		hc.field = PropertyUtils.camelizeLowerCase(gb.getColumnName());
		hc.label = gb.getCaption();
		hc.style = new DefaultStyle();
		hc.show = gb.isShow();
		hc.selectionEnum = gb.getSelectionEnum();
		hc.numeric = gb.getType().isNumeric();
		return hc;
	}
	
}
