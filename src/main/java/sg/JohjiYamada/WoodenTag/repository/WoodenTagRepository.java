package sg.JohjiYamada.WoodenTag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.JohjiYamada.WoodenTag.entity.WoodenTag;

public interface WoodenTagRepository extends JpaRepository<WoodenTag, Long>{
//PagingAndSortingRepository<WoodenTag, Long>, JpaSpecificationExecutor<WoodenTag> {
//extends JpaRepository<WoodenTag, Long>  {
//	CrudRepositoryも後で試そう
}
