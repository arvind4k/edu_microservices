package com.talooz.ms.finance.fee.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FINE_SLAB")
public class FineSlab implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer fineSlabId;
	private Integer delayDays;
	private Double fineValue;
	private String fineMode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FINE_ID")
	private Fine fine;
	
	public FineSlab() {
	}

	public FineSlab(Integer fineSlabId, Integer delayDays, Double fineValue, String fineMode) {
		this.fineSlabId = fineSlabId;
		this.delayDays = delayDays;
		this.fineValue = fineValue;
		this.fineMode = fineMode;
	}

	public Integer getFineSlabId() {
		return fineSlabId;
	}
	public void setFineSlabId(Integer fineSlabId) {
		this.fineSlabId = fineSlabId;
	}
	public Integer getDelayDays() {
		return delayDays;
	}
	public void setDelayDays(Integer delayDays) {
		this.delayDays = delayDays;
	}
	public Double getFineValue() {
		return fineValue;
	}
	public void setFineValue(Double fineValue) {
		this.fineValue = fineValue;
	}
	public String getFineMode() {
		return fineMode;
	}
	public void setFineMode(String fineMode) {
		this.fineMode = fineMode;
	}
	public Fine getFine() {
		return fine;
	}
	public void setFine(Fine fine) {
		this.fine = fine;
	}
}
