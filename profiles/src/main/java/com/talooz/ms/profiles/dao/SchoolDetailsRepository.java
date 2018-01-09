package com.talooz.ms.profiles.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.profiles.entity.SchoolDetails;
import com.talooz.ms.profiles.entity.User;

@RepositoryRestResource(collectionResourceRel = "schoolDetails", path = "schoolDetails")
public interface SchoolDetailsRepository extends CrudRepository<SchoolDetails, Long> {
	public User findByUserId(@Param("userId") Long userId);
}
