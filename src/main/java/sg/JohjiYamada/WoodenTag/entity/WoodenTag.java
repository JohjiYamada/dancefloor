package sg.JohjiYamada.WoodenTag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sg.JohjiYamada.WoodenTag.entity.Enum.FromTypeEnum;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wooden_tag")
public class WoodenTag{

	
	@Id
	@GeneratedValue
	private Long id;
//	タイトル	祝開業
//	メッセージ	誕生日おめでとう
//	縦横区分	指定なし、縦、横
//	送り主情報	なし、あり
//	送り先情報	なし？、あり
//	送り主連名パターン	一人、家族連名、一般連名、会社名のみ
//	利用フォーマット	
	
	@NotBlank
	@NotNull
	@Size(max = 10)
	private String title;

	@Column(length = 100)
	private String message;

	@NotNull
	private Boolean landscape;

	@NotNull
	private Boolean senderType;

	@Enumerated(EnumType.ORDINAL)
	private FromTypeEnum fromType;

//	@OneToMany(mappedBy = "woodenTag", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<CompanyInfo> companyInfoList;
	
}
