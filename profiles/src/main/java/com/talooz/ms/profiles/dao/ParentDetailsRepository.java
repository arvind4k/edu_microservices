package com.talooz.ms.profiles.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.profiles.entity.ParentDetails;

@RepositoryRestResource(collectionResourceRel = "parentDetails", path = "parentDetails")
public interface ParentDetailsRepository extends CrudRepository<ParentDetails, Long> {
	public List<ParentDetails> findByUserId(@Param("userId") Long userId);
}
