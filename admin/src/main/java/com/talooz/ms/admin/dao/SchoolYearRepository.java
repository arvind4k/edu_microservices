package com.talooz.ms.admin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.entity.SchoolYear;



@RepositoryRestResource(collectionResourceRel = "schoolyear", path = "schoolyear")
public interface SchoolYearRepository extends CrudRepository<SchoolYear, Long>	{

	List<SchoolYear> findByEntityId(@Param("entityId") Integer entityId);
	
	SchoolYear findByEntityIdAndSchoolYearId(@Param("entityId") Integer entityId, @Param("schoolYearId") Integer schoolYearId);
	
}


