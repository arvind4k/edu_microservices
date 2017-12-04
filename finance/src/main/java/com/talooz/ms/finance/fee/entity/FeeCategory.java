package com.talooz.ms.finance.fee.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "FEE_CATEGORIES")
public class FeeCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long feeCategoryId;
	private String feeName;
	private String feeDescription;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private Integer dueDate;
	private String paymentFrequencyId;
	private Long createdBy;
	private Long updatedBy;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updationDate;
	@OneToMany(mappedBy="feeCategory",cascade = CascadeType.ALL)
	private List<FeeBatchMapping> feeBatchMapping;
	private Integer obsolete;
	@Transient
	private String paymentFrequencyDesc;
	
	
	public FeeCategory(Long feeCategoryId, String feeName, String feeDescription, Date startDate, Date endDate, Integer dueDate, String paymentFrequencyId, String paymentFrequencyDesc) {
		this.feeCategoryId = feeCategoryId;
		this.feeName = feeName;
		this.feeDescription=feeDescription;
		this.startDate=startDate;
		this.endDate=endDate;
		this.dueDate=dueDate;
		this.paymentFrequencyId=paymentFrequencyId;
		this.paymentFrequencyDesc=paymentFrequencyDesc;
	}

	public FeeCategory() {
	}

	public Long getFeeCategoryId() {
		return feeCategoryId;
	}

	public void setFeeCategoryId(Long feeCategoryId) {
		this.feeCategoryId = feeCategoryId;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	public List<FeeBatchMapping> getFeeBatchMapping() {
		return feeBatchMapping;
	}

	public void setFeeBatchMapping(List<FeeBatchMapping> feeBatchMapping) {
		this.feeBatchMapping = feeBatchMapping;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getDueDate() {
		return dueDate;
	}

	public void setDueDate(Integer dueDate) {
		this.dueDate = dueDate;
	}

	public String getPaymentFrequencyId() {
		return paymentFrequencyId;
	}

	public void setPaymentFrequencyId(String paymentFrequencyId) {
		this.paymentFrequencyId = paymentFrequencyId;
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

	public Integer getObsolete() {
		return obsolete;
	}

	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}

	public String getPaymentFrequencyDesc() {
		return paymentFrequencyDesc;
	}

	public void setPaymentFrequencyDesc(String paymentFrequencyDesc) {
		this.paymentFrequencyDesc = paymentFrequencyDesc;
	}
}
