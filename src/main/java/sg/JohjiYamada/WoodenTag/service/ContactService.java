package sg.JohjiYamada.WoodenTag.service;

import org.springframework.stereotype.Service;

import sg.JohjiYamada.WoodenTag.entity.Contact;
import sg.JohjiYamada.WoodenTag.repository.ContactRepository;

@Service
public class ContactService extends AbstractService<Contact, ContactRepository> {

}