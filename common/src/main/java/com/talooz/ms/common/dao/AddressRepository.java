package com.talooz.ms.common.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talooz.ms.common.entity.Address;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends CrudRepository<Address, Long>	 {
	List<Address> findByAddressType(@Param("addressType") String addressType);
	List<Address> findByModIdAndModuleName(@Param("modId") Integer modId, @Param("moduleName") String moduleName);
	List<Address> findByModId(@Param("modId") Integer modId);
}
