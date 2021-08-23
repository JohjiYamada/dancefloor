package sg.JohjiYamada.WoodenTag.Util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumColumnType {
	ID("システムID", true),
	STRING("文字列", false), 
	SELECTION("選択値", false),
	DIGIT("数値", false),
	NUMBER("整数値(カンマ区切り)", true),
	DECIMAL("小数点付きの数字", true),
	PRICE("金額", true),
	DATE("日付", false), 
	DATE_TIME("日時", false),
	TIME("時間", false),
	EMAIL("メールアドレス", false),
	PHONE("電話番号", false),
	PICTURE("写真・スクリーンショット", false),
	SYSTEM("システムカラム", false),
	ID_REF("IDリファレンス", false),
	PRC_DATE("prc_date/create_date", false),
	PRC_USER("prc_user_code/create_user_code", false),
	;
	private String dispName;
	private boolean isNumeric;
}
