package sg.JohjiYamada.WoodenTag.service.system;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import sg.JohjiYamada.WoodenTag.entity.system.TableInfo;

@Service
public class TableInfoService {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<TableInfo> getTables(){
		return entityManager
			.createNativeQuery(
				"SELECT "
				+ "table_name, "
				+ "column_name, "
				+ "ordinal_position, "
				+ "nullable, "
				+ "type_name "
				+ "FROM INFORMATION_SCHEMA.COLUMNS "
				+ "where table_schema = 'PUBLIC' AND TABLE_NAME !='DUMMY_TABLES' "
				+ "ORDER BY TABLE_NAME, ORDINAL_POSITION",
				"tableInfo" ) 
			.getResultList();
	}

}
