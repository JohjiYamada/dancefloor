package sg.JohjiYamada.WoodenTag.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum FromTypeEnum {
	SINGLE("送り元一人のみ"),
	FAMILY("家族で連盟（3人まで）"),
	UNION("フルネームで連盟（3人まで）"),
	COMPANY_ONLY("送り元に会社名");
	
	private String dispName;
	
//	public static void main(String[] args) {
//		FromTypeEnum e = new Fromtype
//	}
}
