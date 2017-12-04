package com.talooz.ms.finance.fee.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.fee.entity.FeeCategory;

@Repository
public interface FeeCategoryRepository extends CrudRepository<FeeCategory, Long> {

	@Query("select new com.talooz.ms.finance.fee.entity.FeeCategory(fc.feeCategoryId,fc.feeName,fc.feeDescription, fc.startDate, fc.endDate, fc.dueDate, fc.paymentFrequencyId, pf.description) from FeeCategory fc, PaymentFrequency pf where fc.paymentFrequencyId=pf.paymentFrequencyId and fc.obsolete=0")
	List<FeeCategory> findFeeCategories();

	@Query("select new com.talooz.ms.finance.fee.entity.FeeCategory(fc.feeCategoryId,fc.feeName,fc.feeDescription, fc.startDate, fc.endDate, fc.dueDate, fc.paymentFrequencyId, pf.description) from FeeCategory fc, PaymentFrequency pf where fc.paymentFrequencyId=pf.paymentFrequencyId and fc.obsolete=0")
	List<FeeCategory> findFeeCategories(Pageable pagable);

	@Query("select new com.talooz.ms.finance.fee.entity.FeeCategory(fc.feeCategoryId,fc.feeName,fc.feeDescription, fc.startDate, fc.endDate, fc.dueDate, fc.paymentFrequencyId, pf.description) from FeeCategory fc,"
			+ "FeeBatchMapping fbm, PaymentFrequency pf where fc.feeCategoryId=fbm.feeCategory.feeCategoryId and fc.paymentFrequencyId=pf.paymentFrequencyId and fc.obsolete=0 and fbm.batchId=?1")
	List<FeeCategory> findFeeCategoriesByBatchId(Long batchId);
	
}
