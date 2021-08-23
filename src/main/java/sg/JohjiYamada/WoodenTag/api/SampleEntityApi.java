package sg.JohjiYamada.WoodenTag.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.JohjiYamada.WoodenTag.entity.SampleEntity;
import sg.JohjiYamada.WoodenTag.repository.SampleEntityRepository;

@RestController
@RequestMapping("/api/sample_entity")
public class SampleEntityApi extends AbstractApi<SampleEntity, SampleEntityRepository>{

}
