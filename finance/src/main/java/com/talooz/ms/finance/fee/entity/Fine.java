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

@Entity
@Table(name="FINE")
public class Fine implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fineId;
	private String fineName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@OneToMany(mappedBy="fine",cascade = CascadeType.ALL)
	private List<FineSlab> fineSlabs;
	
	public Fine(Integer fineId, String fineName, Date creationDate) {
		super();
		this.fineId = fineId;
		this.fineName = fineName;
		this.creationDate = creationDate;
	}
	
	public Fine() {
	}

	public Integer getFineId() {
		return fineId;
	}
	public void setFineId(Integer fineId) {
		this.fineId = fineId;
	}
	public String getFineName() {
		return fineName;
	}
	public void setFineName(String fineName) {
		this.fineName= fineName;
	}
	public List<FineSlab> getFineSlabs() {
		return fineSlabs;
	}
	public void setFineSlabs(List<FineSlab> fineSlabs) {
		this.fineSlabs = fineSlabs;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
