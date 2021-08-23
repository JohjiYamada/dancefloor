package sg.JohjiYamada.WoodenTag.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.JohjiYamada.WoodenTag.entity.CompanyInfo;
import sg.JohjiYamada.WoodenTag.repository.CompanyInfoRepository;

@RestController
@RequestMapping("/api/company_info")
public class CompanyInfoApi extends AbstractApi<CompanyInfo, CompanyInfoRepository> {
	
}
