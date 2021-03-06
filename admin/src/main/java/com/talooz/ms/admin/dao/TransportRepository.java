package com.talooz.ms.admin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.admin.entity.Transport;
import com.talooz.ms.admin.entity.TransportParticulars;


@RepositoryRestResource(collectionResourceRel = "transport", path = "transport")
public interface TransportRepository extends CrudRepository<Transport, Long>	 {
	List<TransportParticulars> findByRouteId(@Param("routeId") Long routeId);
	
	List<Transport> findByEntityId(@Param("entityId") Integer entityId);
	
	List<Transport> findByEntityIdAndRouteId(@Param("entityId") Integer entityId, @Param("routeId") Long routeId);
	
}
