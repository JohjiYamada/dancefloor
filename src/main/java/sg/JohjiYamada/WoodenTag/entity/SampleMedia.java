package sg.JohjiYamada.WoodenTag.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
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
@Table(name = "sample_media")
@TableDef(caption = "サンプルファイル情報", description = "サンプルManyToOne")
public class SampleMedia extends AbstractEntity<SampleMedia> {

//	@Id
//	@GeneratedValue
//	@ColumnDef(caption = "ID", type = EnumColumnType.ID, length = 19, columnOrder = 0)
//	private Long sampleMediaId;

//	@ColumnDef(caption = "1:多接続id", type = EnumColumnType.SYSTEM, length = 100, required = true, columnOrder = 10)
//	private Long sampleEntityId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="sampleEntityId", nullable=false)
	@ColumnDef(type = EnumColumnType.SYSTEM, caption = "", columnOrder = 0, length = 0)
	private SampleEntity sampleEntity;
	
	@NotBlank
	@Size(max = 100)
	@ColumnDef(caption = "ファイル名称", type = EnumColumnType.STRING, length = 100, required = true, columnOrder = 10)
	private String name;

	@NotBlank
	@Size(max = 100)
	@ColumnDef(caption = "格納URL", type = EnumColumnType.STRING, length = 100, required = true, columnOrder = 20)
	private String url;

//	@Lob
//	@Column(name = "photo", columnDefinition = "BLOB")
//	@ColumnDef(caption = "写真", type = EnumColumnType.PICTURE, length = 30, columnOrder = 30)
//	private byte[] photo;

}