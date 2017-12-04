package com.talooz.ms.finance.fee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.fee.entity.Fine;

@Repository
public interface FineRepository extends CrudRepository<Fine, Integer> {
	
	@Query("select new com.talooz.ms.finance.fee.entity.Fine(f.fineId, f.fineName, f.creationDate) from Fine f")
	List<Fine> findAllFines();
	
	@Query("select new com.talooz.ms.finance.fee.entity.Fine(f.fineId, f.fineName, f.creationDate) from Fine f where f.fineId=:fineId")
	Fine findFineById(@Param("fineId") Integer fineId);
}
