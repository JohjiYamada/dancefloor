package sg.JohjiYamada.WoodenTag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sg.JohjiYamada.WoodenTag.Util.ColumnDef;
import sg.JohjiYamada.WoodenTag.Util.EnumColumnType;
import sg.JohjiYamada.WoodenTag.Util.TableDef;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "company_info")
@TableDef(caption = "会社情報", description = "会社情報を保持する")
public class CompanyInfo extends AbstractEntity<CompanyInfo> {

//	@Id
//	@GeneratedValue
//	@ColumnDef(caption = "ID", type = EnumColumnType.ID, length = 19, columnOrder = 0)
//	private Long companyInfoId;

	
	@Size(max = 50)
	@ColumnDef(caption = "接頭辞", type = EnumColumnType.STRING, length = 50, columnOrder = 1)
	private String companyPrefix;

	@Size(max = 300)
	@NotBlank
	@ColumnDef(caption = "会社名称", type = EnumColumnType.STRING, length = 100, required = true, columnOrder = 2)
	private String companyName;
	
	@Size(max = 50)
	@ColumnDef(caption = "接尾辞", type = EnumColumnType.STRING, length = 50, columnOrder = 3)
	private String companySuffix;


//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "tag_id", nullable = false)
//	private WoodenTag woodenTag;

//	@Override
//	public void setFieldsForUpdate(CompanyInfo entity) {
//		this.companyName = entity.companyName;
//		this.companyPrefix = entity.companyPrefix;
//		this.companySuffix = entity.companySuffix;
//	}

}
