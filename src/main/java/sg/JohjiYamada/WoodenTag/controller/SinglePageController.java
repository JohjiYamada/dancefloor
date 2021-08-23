package sg.JohjiYamada.WoodenTag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePageController {
//	private final Logger logger = LoggerFactory.getLogger((this.getClass());

//	@GetMapping(value = { "/", "/index" })
	@GetMapping("/**/{path:[^.]*}")
	public String any() {
		return "index.html";
	}

}
