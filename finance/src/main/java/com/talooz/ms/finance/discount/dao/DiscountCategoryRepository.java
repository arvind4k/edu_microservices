package com.talooz.ms.finance.discount.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.talooz.ms.finance.discount.entity.DiscountCategory;

@Repository
@RepositoryRestResource(collectionResourceRel = "discountCategory", path = "discountCategory", itemResourceRel="discountCategory")
public interface DiscountCategoryRepository extends CrudRepository<DiscountCategory, Long>{
	
	DiscountCategory findByCategoryId(@Param("categoryId") String categoryId);
}
