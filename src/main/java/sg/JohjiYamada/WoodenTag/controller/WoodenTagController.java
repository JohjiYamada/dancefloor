package sg.JohjiYamada.WoodenTag.controller;

//@Controller
//@RequestMapping(value = "/test")
public class WoodenTagController {
////	private final Logger logger = LoggerFactory.getLogger((this.getClass());
//
//	private final int ROW_PER_PAGE = 3;
//
//	@Autowired
//	private WoodenTagService woodenTagService;
//	@Autowired
//	private CompanyInfoService companyInfoService;
//
////	@Value("${msg.title}")
//	private String title;
//
//	@ModelAttribute
//	public void addAttributes(Model model) {
//		model.addAttribute("fromTypeEnum", FromTypeEnum.values());
//	}
//	
//	@GetMapping(value = { "/", "/index" })
//	public String index(Model model) {
//		model.addAttribute("title", title);
//		return "index.html";
//	}
//
//	
//	
//	
//	@GetMapping(value = "/tags")
//	public String getContacts(Model model, @RequestParam(value = "page", defaultValue = "1") int pageNumber) {
////		List<WoodenTag> woodenTags = woodenTagService.findWoodenTags(pageNumber, ROW_PER_PAGE);
////
//////		long count = woodenTagService.count();
////		boolean hasPrev = pageNumber > 1;
////		boolean hasNext = (pageNumber * ROW_PER_PAGE) < count;
////		model.addAttribute("woodenTags", woodenTags);
////		model.addAttribute("hasPrev", hasPrev);
////		model.addAttribute("prev", pageNumber - 1);
////		model.addAttribute("hasNext", hasNext);
////		model.addAttribute("next", pageNumber + 1);
//		return "woodentag-list";
//	}
//
//	@GetMapping(value = { "/tags/add" })
//	public String showAddContact(Model model) {
//		WoodenTag tag = new WoodenTag();
//		List<CompanyInfo> infoList = new ArrayList<>();
////		tag.setCompanyInfoList(infoList);
//		infoList.add(new CompanyInfo());
//		infoList.add(new CompanyInfo());
//		infoList.add(new CompanyInfo());
//
//		model.addAttribute("add", true);
//		model.addAttribute("tag", tag);
//		
//		return "tag-edit";
//	}
//
//	@PostMapping(value = "/tags/add")
//	public String addContact(Model model, @ModelAttribute("tag") WoodenTag tag) {
//		try {
////			for (CompanyInfo info : tag.getCompanyInfoList()) {
////				info.setWoodenTag(tag);
////			}
//			WoodenTag newTag = woodenTagService.save(tag);
//			return "redirect:/tags/" + String.valueOf(newTag.getId());
//		} catch (Exception ex) {
//			// log exception first,
//			// then show error
//			String errorMessage = ex.getMessage();
//			model.addAttribute("errorMessage", errorMessage);
//
//			// model.addAttribute("contact", contact);
//			model.addAttribute("add", true);
//			return "tag-edit";
//		}
//	}
//
//	@GetMapping(value = { "/tags/{tagId}/edit" })
//	public String showEditContact(Model model, @PathVariable Long tagId) {
//		WoodenTag tag = null;
//		try {
//			tag = woodenTagService.findById(tagId).orElse(null);
//		} catch (Exception ex) {
//			model.addAttribute("errorMessage", "tag not found");
//		}
//		model.addAttribute("add", false);
//		model.addAttribute("tag", tag);
//		model.addAttribute("fromTypeEnum", FromTypeEnum.values());
//
//		
//		return "tag-edit";
//	}
//
//	@PostMapping(value = { "/tags/{tagId}/edit" })
//	public String updateContact(Model model, @PathVariable Long tagId, @ModelAttribute("tag") WoodenTag tag) {
//		try {
//			model.addAttribute("fromTypeEnum", FromTypeEnum.values());
//			tag.setId(tagId);
//			WoodenTag oldTag = woodenTagService.findById(tagId).orElseThrow();
////			companyInfoService.deleteAll(oldTag.getCompanyInfoList());
////			for (CompanyInfo info : tag.getCompanyInfoList()) {
////				info.setWoodenTag(tag);
////			}
//			woodenTagService.save(tag);
//			return "redirect:/tags/" + String.valueOf(tag.getId());
//		} catch (Exception ex) {
//			// log exception first,
//			// then show error
//			String errorMessage = ex.getMessage();
//			model.addAttribute("errorMessage", errorMessage);
//
//			model.addAttribute("add", false);
//			return "tag-edit";
//		}
//	}
//
//	@GetMapping(value = "/tags/{tagId}")
//	public String getContactById(Model model, @PathVariable long tagId) {
//		WoodenTag tag = null;
//		try {
//			tag = woodenTagService.findById(tagId).orElse(null);
//		} catch (Exception ex) {
//			model.addAttribute("errorMessage", "Contact not found");
//		}
//		model.addAttribute("tag", tag);
//		return "tag";
//	}
//
//	@GetMapping(value = { "/tags/{tagId}/delete" })
//	public String showDeleteContactById(Model model, @PathVariable Long tagId) {
//		WoodenTag tag = null;
//		try {
//			tag = woodenTagService.findById(tagId).orElse(null);
//		} catch (Exception ex) {
//			model.addAttribute("errorMessage", "Contact not found");
//		}
//		model.addAttribute("allowDelete", true);
//		model.addAttribute("tag", tag);
//		return "tag";
//	}
//
//	@PostMapping(value = { "/tags/{tagId}/delete" })
//	public String deleteContactById(Model model, @PathVariable Long tagId) {
//		try {
//			woodenTagService.delete(tagId);
//			return "redirect:/tags";
//		} catch (Exception ex) {
//			String errorMessage = ex.getMessage();
//			model.addAttribute("errorMessage", errorMessage);
//			return "tag";
//		}
//	}

}
