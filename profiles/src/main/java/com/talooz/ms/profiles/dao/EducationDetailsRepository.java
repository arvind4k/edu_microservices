package com.talooz.ms.profiles.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.profiles.entity.EducationDetails;

@RepositoryRestResource(collectionResourceRel = "educationDetails", path = "educationDetails")
public interface EducationDetailsRepository extends CrudRepository<EducationDetails, Long> {
	public List<EducationDetails> findByUserId(@Param("userId") Long userId);
}
