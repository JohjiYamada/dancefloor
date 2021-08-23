package sg.JohjiYamada.WoodenTag.entity.system;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SqlResultSetMapping(
		name = "tableInfo", 
		classes = { 
			@ConstructorResult(
				targetClass = sg.JohjiYamada.WoodenTag.entity.system.TableInfo.class,
				columns = { 
					@ColumnResult(name = "table_name", type = String.class),
					@ColumnResult(name = "column_name", type = String.class),
					@ColumnResult(name = "ordinal_position", type = Integer.class),
					@ColumnResult(name = "nullable", type = Integer.class),
					@ColumnResult(name = "type_name", type = String.class)
				}
			)
		}
	)

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DummyTables {
	@Id
	@GeneratedValue
	private Long id;
}

// This is just a dummy Entity to load data from INFORMATION_SCHEMA.COLUMNS 
// since @SqlResultSetMapping needs to be on @Entity