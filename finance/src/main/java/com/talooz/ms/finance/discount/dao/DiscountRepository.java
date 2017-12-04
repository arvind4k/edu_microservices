package com.talooz.ms.finance.discount.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.discount.entity.Discount;

@Repository
@RepositoryRestResource(collectionResourceRel = "discount", path = "discount", itemResourceRel = "discount")
public interface DiscountRepository extends CrudRepository<Discount, Long> {

	@Query("select new com.talooz.ms.finance.discount.entity.Discount(d.discountId,d.discountName,d.discountCategoryId,"
			+ "dc.name,d.studentCategoryId,d.batchId,d.feeCategoryId,fc.feeName,d.studentId,d.appliedOn,d.amount,"
			+ "d.percentage,d.discountMode,d.creationDate) from Discount d, DiscountCategory dc, FeeCategory fc "
			+ "where d.discountCategoryId=dc.categoryId and d.feeCategoryId=fc.feeCategoryId and d.obsolete=0")
	List<Discount> findValidDiscounts();
	
	@Query("select new com.talooz.ms.finance.discount.entity.Discount(d.discountId,d.discountName,d.discountCategoryId,"
			+ "dc.name,d.studentCategoryId,d.batchId,d.feeCategoryId,fc.feeName,d.studentId,d.appliedOn,d.amount,"
			+ "d.percentage,d.discountMode,d.creationDate) from Discount d, DiscountCategory dc, FeeCategory fc "
			+ "where d.discountCategoryId=dc.categoryId and d.feeCategoryId=fc.feeCategoryId and d.obsolete=0 and d.feeCategoryId=:feeId and d.batchId=:batchId")
	List<Discount> findDiscountsByFeeIdAndBatchId(@Param("feeId") Long feeId,@Param("batchId") Long batchId);
}
