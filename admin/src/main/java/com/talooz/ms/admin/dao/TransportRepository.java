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
	
	//List<Transport> findByRouteIdAndEntityId(@Param("entityId") Integer entityId);
	
	List<Transport> findByRouteIdAndEntityId(@Param("routeId") Long routeId, @Param("entityId") Integer entityId);
	
}
