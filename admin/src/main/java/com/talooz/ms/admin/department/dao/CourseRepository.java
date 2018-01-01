package com.talooz.ms.admin.department.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.department.entity.Course;

@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends CrudRepository<Course, Long>	 {
	
	List<Course> findByEntityId(@Param("entityId") Integer entityId);
	
	List<Course> findByEntityIdAndSchoolYearId(@Param("entityId") Integer entityId, @Param("schoolYearId") Integer schoolYearId);
	
}
