package sg.JohjiYamada.WoodenTag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.JohjiYamada.WoodenTag.entity.Contact;

public interface ContactRepository
		extends JpaRepository<Contact, Long> {
}