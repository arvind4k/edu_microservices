package com.talooz.ms.finance.fee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.fee.entity.FineSlab;

@Repository
public interface FineSlabRepository extends CrudRepository<FineSlab, Integer>{

	@Query("select new com.talooz.ms.finance.fee.entity.FineSlab(fs.fineSlabId, fs.delayDays, fs.fineValue, fs.fineMode) from FineSlab fs where fs.fine.fineId=:fineId")
	List<FineSlab> findFineSlabsByFineId(@Param("fineId") Integer fineId);
}
