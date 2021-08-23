package sg.JohjiYamada.WoodenTag.api;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import sg.JohjiYamada.WoodenTag.entity.AbstractEntity;

public abstract class AbstractApi<ENTITY extends AbstractEntity<ENTITY>, REPOSITORY extends JpaRepository<ENTITY, Long>> {

//	@PostMapping(value = "/search", consumes = "application/json", produces = "application/json")
//	@ResponseStatus(HttpStatus.OK)
//	abstract public List<ENTITY> search();

	@Autowired
	protected REPOSITORY repository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ENTITY> findAll() {
		List<ENTITY> entity = repository.findAll(Sort.by("id").descending());
		return entity;
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ENTITY find(@PathVariable("id") Long id) {
		ENTITY entity = repository.findById(id).orElseThrow();
		return entity;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ENTITY createEntity(@RequestBody @Valid ENTITY entity, Errors errors) {
		entity.setErrorDetails(null);
		if (errors.hasErrors()) {
			setErrors(entity, errors);
			return entity;
		}
		updateSystemColumn(entity);
		ENTITY createdEntity = repository.save(entity);
		return createdEntity;
	}

	private void setErrors(ENTITY entity, Errors errors) {

//		entity.setValidationError(true);
//		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		Map<String, List<String>> map = new ConcurrentHashMap<>();
		List<String> msgList = null;
		for (ObjectError error : errors.getGlobalErrors()) {
			if(map.containsKey("_global")) {
				msgList = map.get("_global");
			} else {
				msgList = new ArrayList<>();
			}
			msgList.add(error.getDefaultMessage());
			map.put("_global", msgList);
		}
		for (FieldError error : errors.getFieldErrors()) {
			if(map.containsKey(error.getField())) {
				msgList = map.get(error.getField());
			} else {
				msgList = new ArrayList<>();
			}
			msgList.add(error.getDefaultMessage());
			map.put(error.getField(), msgList);
		}
//		entity.setErrorDetail(map);
		entity.setErrorDetails(map);
	};

	@PostMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ENTITY updateEntity(@RequestBody @Valid ENTITY newEntity, Errors errors, @PathVariable Long id) {
		newEntity.setErrorDetails(null);
		if (errors.hasErrors()) {
			setErrors(newEntity, errors);
			return newEntity;
		}
		ENTITY entity = repository.findById(id).orElseThrow();
		entity.setFieldsForUpdate(newEntity);
		updateSystemColumn(entity);
		ENTITY updatedEntity = repository.save(entity);
		return updatedEntity;
	}

	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteList(@RequestBody List<Long> delIdList) {
		for (Long delId : delIdList) {
			repository.deleteById(delId);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	protected void updateSystemColumn(ENTITY entity) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		String user = "jojo";
		if (entity.getCreateDate() == null) {
			entity.setCreateDate(now);
			entity.setCreateUserCode(user);
		}
		entity.setPrcDate(now);
		entity.setPrcUserCode(user);
	}


}
