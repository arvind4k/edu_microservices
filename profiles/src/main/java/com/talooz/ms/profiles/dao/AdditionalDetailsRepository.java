package com.talooz.ms.profiles.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.profiles.entity.AdditionalDetails;

@RepositoryRestResource(collectionResourceRel = "additionalDetails", path = "additionalDetails")
public interface AdditionalDetailsRepository extends CrudRepository<AdditionalDetails, Long> {
	public AdditionalDetails findByUserId(@Param("userId") Long userId);
}
