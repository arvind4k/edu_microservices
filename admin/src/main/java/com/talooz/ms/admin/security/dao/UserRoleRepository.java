package com.talooz.ms.admin.security.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.security.entity.UserRole;
import com.talooz.ms.admin.security.entity.UserRoleParticulars;


@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface UserRoleRepository extends CrudRepository<UserRole, Long>	 {
	
	List<UserRole> findByEntityId(@Param("entityId") Integer entityId);
	
	List<UserRole> findByEntityIdAndRoleId(@Param("entityId") Integer entityId, @Param("roleId") Integer roleId);
	
}
