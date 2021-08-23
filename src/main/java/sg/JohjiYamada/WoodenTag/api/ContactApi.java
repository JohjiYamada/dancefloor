package sg.JohjiYamada.WoodenTag.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.JohjiYamada.WoodenTag.entity.Contact;
import sg.JohjiYamada.WoodenTag.repository.ContactRepository;

@RestController
@RequestMapping("/api/contact")
public class ContactApi extends AbstractApi<Contact, ContactRepository>{

}
