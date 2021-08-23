package sg.JohjiYamada.WoodenTag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.JohjiYamada.WoodenTag.entity.SampleEntity;

public interface SampleEntityRepository
		extends JpaRepository<SampleEntity, Long> {
}