package sg.JohjiYamada.WoodenTag.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import sg.JohjiYamada.WoodenTag.entity.AbstractEntity;

abstract public class AbstractService<ENTITY extends AbstractEntity<ENTITY>, REPOSITORY extends JpaRepository<ENTITY, Long>> {

	@Autowired
	protected REPOSITORY repository;

	public Optional<ENTITY> findById(Long id) {
		return repository.findById(id);
	}

	public List<ENTITY> findAll() {
		return repository.findAll(Sort.by("id").descending());
	}

	public ENTITY save(ENTITY info) {
		updateSystemColumn(info);
		return repository.save(info);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public void deleteAll(List<ENTITY> infoList) {
		repository.deleteAll(infoList);
		repository.flush();
	}

	public Long count() {
		return repository.count();
	}
	
	protected void updateSystemColumn(ENTITY entity) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		String user = "jojo";
		if(entity.getCreateDate() == null) {
			entity.setCreateDate(now);
			entity.setCreateUserCode(user);
		}
		entity.setPrcDate(now);
		entity.setPrcUserCode(user);
	}
}
