package com.talooz.ms.profiles.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EORGS")
public class Eorg implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long entityId;
	private String entityName;
	private String entityType;
	private Long parentEntityId;
	private Integer obsolete;
	
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public String getEntityType() {
		return entityType;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public Long getParentEntityId() {
		return parentEntityId;
	}
	public void setParentEntityId(Long parentEntityId) {
		this.parentEntityId = parentEntityId;
	}
	public Integer getObsolete() {
		return obsolete;
	}
	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}
	
	
}
