package sg.JohjiYamada.WoodenTag.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sg.JohjiYamada.WoodenTag.Util.ColumnDef;
import sg.JohjiYamada.WoodenTag.Util.EnumColumnType;
import sg.JohjiYamada.WoodenTag.Util.TableDef;

@Validated
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
@TableDef(caption = "個人情報", description = "個人に紐づく情報を保持")
public class Contact extends AbstractEntity<Contact> {
	
//	@Id
//	@GeneratedValue
//	@ColumnDef(caption = "ID", type = EnumColumnType.ID, length = 19, columnOrder = 0)
//	private Long contactId;
	
	@NotBlank
	@Size(max=100)
	@ColumnDef(caption = "顧客名称", type = EnumColumnType.STRING, length = 100, required = true, columnOrder = 1)
	private String name;

	@NotBlank
	@Pattern(regexp = "^\\+?[0-9.]{7,11}$")
	@ColumnDef(caption = "顧客電話番号", type = EnumColumnType.PHONE, length = 25, columnOrder = 2)
	private String phone;

	@Email
	@Size(min = 0, max = 256)
	@ColumnDef(caption = "顧客メールアドレス", type = EnumColumnType.EMAIL, length = 256, columnOrder = 3)
	private String email;

	@Size(max = 100)
	@ColumnDef(caption = "住所1", type = EnumColumnType.STRING, length = 100, columnOrder = 4)
	private String address1;

	@Size(max = 100)
	@ColumnDef(caption = "住所2", type = EnumColumnType.STRING, length = 100, columnOrder = 5)
	private String address2;

	@Size(max = 100)
	@ColumnDef(caption = "住所3", type = EnumColumnType.STRING, length = 100, columnOrder = 6, show=false)
	private String address3;

	@Size(max = 20)
	@ColumnDef(caption = "郵便番号", type = EnumColumnType.DIGIT, length = 20, columnOrder = 7)
	private String postalCode;

	@Digits(integer=10 ,fraction=2)
	@ColumnDef(caption = "予算", type = EnumColumnType.PRICE, length = 4000, columnOrder = 8)
	private Double averagePrice;

	@NotNull
	@Digits(integer=1 ,fraction=0)
	@ColumnDef(caption = "性別", type = EnumColumnType.SELECTION, length = 1, columnOrder = 9, selectionEnum="Gender")
	private Integer gender;
	
	@NotNull
	@Past
	@ColumnDef(caption = "誕生日", type = EnumColumnType.DATE, length = 10, columnOrder = 10)
	private Timestamp birthday;
	
	@ColumnDef(caption = "最終ログイン", type = EnumColumnType.DATE_TIME, length = 10, columnOrder = 11)
	private Timestamp lastLogin;

	@Size(max = 8)
	@ColumnDef(caption = "起床時刻", type = EnumColumnType.TIME, length = 5, columnOrder = 11)
	@NotNull(message="入力してください")
	private String wakeUp;
	
	@Size(max = 4000)
	@ColumnDef(caption = "メモ", type = EnumColumnType.STRING, length = 4000, columnOrder = 12)
	private String note;

}