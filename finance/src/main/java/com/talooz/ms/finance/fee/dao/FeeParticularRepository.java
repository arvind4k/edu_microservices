package com.talooz.ms.finance.fee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.fee.entity.FeeParticular;

@Repository
public interface FeeParticularRepository extends CrudRepository<FeeParticular, Long> {

	
	@Query("select new  com.talooz.ms.finance.fee.entity.FeeParticular(fp.particularId,fp.feeCategoryId,fp.name,fp.description,fp.amount,fp.batchId, fp.batchName, "
			+ "fp.createdBy, fp.updatedBy, fp.creationDate,fp.updationDate,fp.inputAs, pf.paymentFrequencyId,pf.description, pf.numberOfMonths,pf1.description,pf1.numberOfMonths) "
			+ "from FeeParticular fp,PaymentFrequency pf,PaymentFrequency pf1,FeeCategory fc where fp.feeCategoryId=fc.feeCategoryId and fc.paymentFrequencyId=pf.paymentFrequencyId "
			+ "and fp.inputAs=pf1.paymentFrequencyId and fp.particularId=:id")
	FeeParticular findById(@Param("id") Long particularId);
	
	@Query("select new  com.talooz.ms.finance.fee.entity.FeeParticular(fp.particularId,fp.feeCategoryId,fp.name,fp.description,fp.amount,fp.batchId, fp.batchName, "
			+ "fp.createdBy, fp.updatedBy, fp.creationDate,fp.updationDate,fp.inputAs, pf.paymentFrequencyId,pf.description, pf.numberOfMonths,pf1.description,pf1.numberOfMonths) "
			+ "from FeeParticular fp,PaymentFrequency pf,PaymentFrequency pf1,FeeCategory fc where fp.feeCategoryId=fc.feeCategoryId and fc.paymentFrequencyId=pf.paymentFrequencyId "
			+ "and fp.inputAs=pf1.paymentFrequencyId and fp.feeCategoryId=:feeCategoryId and fp.batchId=:batchId")
	List<FeeParticular> findByFeeCategoryIdAndBatchId(@Param("feeCategoryId") Long feeCategoryId, @Param("batchId") Long batchId);
}
