package sg.JohjiYamada.WoodenTag.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.JohjiYamada.WoodenTag.entity.WoodenTag;
import sg.JohjiYamada.WoodenTag.repository.WoodenTagRepository;

@Service
@Transactional
public class WoodenTagService {
	@Autowired
	private WoodenTagRepository woodenTagRepository;

	public Optional<WoodenTag> findById(Long id) {
		return woodenTagRepository.findById(id);
	}

	public List<WoodenTag> findWoodenTags(/* int pageNumber, int rowPerPage */) {
		List<WoodenTag> tags = new ArrayList<>();
//		Pageable sortedByIdDsc = PageRequest.of(pageNumber - 1, rowPerPage, Sort.by("id").descending());
//		WoodenTagRepository.findAll(sortedByIdDsc).forEach(tags::add);
		tags = woodenTagRepository.findAll();
		return tags;
	}

	public WoodenTag save(WoodenTag tag) {
		return woodenTagRepository.save(tag);
	}

	public void delete(Long id) {
		woodenTagRepository.deleteById(id);
	}
	
//	public Long count() {
//		return WoodenTagRepository.count();
//	}
}
