package sg.JohjiYamada.WoodenTag.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor 
@Getter
public enum Gender implements SelectionEnum<Gender>{
	MALE("男性",0),
	FEMAIL("女性",1),
	UNKNOWN("不明",2);
	
	private String dispName;
	private Integer selectionValue;
}
