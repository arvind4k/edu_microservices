package com.talooz.ms.finance.discount.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DISCOUNT_CATEGORY")
public class DiscountCategory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long discountCategoryId;
	private String name;
	private String description;
	private String categoryId;
	
	public Long getDiscountCategoryId() {
		return discountCategoryId;
	}
	public void setDiscountCategoryId(Long discountCategoryId) {
		this.discountCategoryId = discountCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
