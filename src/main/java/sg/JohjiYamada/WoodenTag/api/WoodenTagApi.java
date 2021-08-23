package sg.JohjiYamada.WoodenTag.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.JohjiYamada.WoodenTag.entity.WoodenTag;
import sg.JohjiYamada.WoodenTag.service.WoodenTagService;


@RestController
@RequestMapping("/api/wooden_tag")
public class WoodenTagApi {
	
	@Autowired
	private WoodenTagService woodenTagService;
	

	@GetMapping
	public List<WoodenTag> getTags() {
		List<WoodenTag> woodenTags = woodenTagService.findWoodenTags();
		return woodenTags;
	}

//	@GetMapping("/{id}")
//	@ResponseStatus(HttpStatus.OK)
//	public List<WoodenTag> getTag(@PathVariable("id") Long id) {
//		List<WoodenTag> woodenTags = woodenTagService.findById(id);
//		return woodenTags;
//	}


	
}
