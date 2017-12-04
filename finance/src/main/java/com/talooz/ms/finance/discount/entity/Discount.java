package com.talooz.ms.finance.discount.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DISCOUNT")
public class Discount implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long discountId;
	private String discountName;
	private String discountCategoryId;
	private String studentCategoryId;
	private Long studentId;
	private Long batchId;
	private Long feeCategoryId;
	private Long appliedOn;
	private String discountMode;
	private Double percentage;
	private Double amount;
	private Long createdBy;
	private Long updatedBy;
	private Date creationDate;
	private Date updationDate;
	@Transient
	private String discountCategoryName;
	@Transient
	private String feeName;
	private Integer obsolete;

	public Discount(Long discountId, String discountName, String discountCategoryId, String discountCategoryName,
			String studentCategoryId, Long batchId, Long feeCategoryId, String feeName, Long studentId, Long appliedOn,
			Double amount, Double percentage, String discountMode, Date creationDate) {
		this.discountId = discountId;
		this.discountName = discountName;
		this.discountCategoryId = discountCategoryId;
		this.discountCategoryName = discountCategoryName;
		this.studentCategoryId = studentCategoryId;
		this.batchId = batchId;
		this.feeCategoryId = feeCategoryId;
		this.feeName = feeName;
		this.studentId = studentId;
		this.appliedOn = appliedOn;
		this.amount = amount;
		this.percentage = percentage;
		this.discountMode = discountMode;
		this.creationDate = creationDate;
	}

	public Discount() {

	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountCategoryId() {
		return discountCategoryId;
	}

	public void setDiscountCategoryId(String discountCategoryId) {
		this.discountCategoryId = discountCategoryId;
	}

	public String getStudentCategoryId() {
		return studentCategoryId;
	}

	public void setStudentCategoryId(String studentCategoryId) {
		this.studentCategoryId = studentCategoryId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getFeeCategoryId() {
		return feeCategoryId;
	}

	public void setFeeCategoryId(Long feeCategoryId) {
		this.feeCategoryId = feeCategoryId;
	}

	public Long getAppliedOn() {
		return appliedOn;
	}

	public void setAppliedOn(Long appliedOn) {
		this.appliedOn = appliedOn;
	}

	public String getDiscountMode() {
		return discountMode;
	}

	public void setDiscountMode(String discountMode) {
		this.discountMode = discountMode;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}

	public String getDiscountCategoryName() {
		return discountCategoryName;
	}

	public void setDiscountCategoryName(String discountCategoryName) {
		this.discountCategoryName = discountCategoryName;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Integer getObsolete() {
		return obsolete;
	}

	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}

}
