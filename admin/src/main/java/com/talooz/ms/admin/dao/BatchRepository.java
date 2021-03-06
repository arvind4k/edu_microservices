package com.talooz.ms.admin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.entity.Batch;

@RepositoryRestResource(collectionResourceRel = "batch", path = "batch", itemResourceRel="batch")
public interface BatchRepository extends CrudRepository<Batch, Long> {
}
