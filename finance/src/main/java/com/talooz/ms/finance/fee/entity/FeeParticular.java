package com.talooz.ms.finance.fee.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "FEE_PARTICULARS")
public class FeeParticular implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long particularId;
	private Long feeCategoryId;
	private String name;
	private String description;
	private Double amount;
	private Long batchId;
	private String batchName;
	private Long createdBy;
	private Long updatedBy;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updationDate;
	private String inputAs;
	@Transient
	private String paymentFrequencyId;
	@Transient
	private String paymentFrequencyDesc;
	@Transient
	private Integer numberOfMonths;
	@Transient
	private String inputAsFrequency;
	@Transient
	private Integer inputAsMonth;

	public FeeParticular(Long particularId, Long feeCategoryId, String name, String description, Double amount,
			Long batchId, String batchName, Long createdBy, Long updatedBy, Date creationDate, Date updationDate,
			String inputAs, String paymentFrequencyId, String paymentFrequencyDesc, Integer numberOfMonths,
			String inputAsFrequency, Integer inputAsMonth) {
		super();
		this.particularId = particularId;
		this.feeCategoryId = feeCategoryId;
		this.name = name;
		this.description = description;
		this.amount = amount;
		this.batchId = batchId;
		this.batchName = batchName;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
		this.inputAs = inputAs;
		this.paymentFrequencyId = paymentFrequencyId;
		this.paymentFrequencyDesc = paymentFrequencyDesc;
		this.numberOfMonths = numberOfMonths;
		this.inputAsMonth = inputAsMonth;
		this.inputAsFrequency = inputAsFrequency;

	}

	public FeeParticular() {
	}

	public Long getParticularId() {
		return particularId;
	}

	public void setParticularId(Long particularId) {
		this.particularId = particularId;
	}

	public Long getFeeCategoryId() {
		return feeCategoryId;
	}

	public void setFeeCategoryId(Long feeCategoryId) {
		this.feeCategoryId = feeCategoryId;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
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

	public String getInputAs() {
		return inputAs;
	}

	public void setInputAs(String inputAs) {
		this.inputAs = inputAs;
	}

	public String getPaymentFrequencyId() {
		return paymentFrequencyId;
	}

	public void setPaymentFrequencyId(String paymentFrequencyId) {
		this.paymentFrequencyId = paymentFrequencyId;
	}

	public String getPaymentFrequencyDesc() {
		return paymentFrequencyDesc;
	}

	public void setPaymentFrequencyDesc(String paymentFrequencyDesc) {
		this.paymentFrequencyDesc = paymentFrequencyDesc;
	}

	public Integer getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(Integer numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public Integer getInputAsMonth() {
		return inputAsMonth;
	}

	public void setInputAsMonth(Integer inputAsMonth) {
		this.inputAsMonth = inputAsMonth;
	}

	public String getInputAsFrequency() {
		return inputAsFrequency;
	}

	public void setInputAsFrequency(String inputAsFrequency) {
		this.inputAsFrequency = inputAsFrequency;
	}

}
