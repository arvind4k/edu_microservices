package com.talooz.ms.profiles.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.profiles.entity.Eorg;

@RepositoryRestResource(collectionResourceRel = "eorg", path = "eorg")
public interface EorgRepository extends CrudRepository<Eorg, Long>	 {
	List<Eorg> findByEntityName(@Param("entityName") String entityName);
}
