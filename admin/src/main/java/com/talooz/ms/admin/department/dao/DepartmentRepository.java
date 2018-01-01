package com.talooz.ms.admin.department.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.department.entity.Department;
import com.talooz.ms.admin.department.entity.DepartmentParticulars;


@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentRepository extends CrudRepository<Department, Long>	 {
	
	List<Department> findByEntityId(@Param("entityId") Integer entityId);
	
	List<Department> findByEntityIdAndSchoolYearId(@Param("entityId") Integer entityId, @Param("schoolYearId") Integer schoolYearId);
	
}
