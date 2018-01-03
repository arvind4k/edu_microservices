package com.talooz.ms.admin.security.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ROLE_PARTICULARS")
public class UserRoleParticulars implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer recordId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROLE_ID")
	//private Long routeId;
    @JsonIgnore
    private UserRole userRole;
	
	private String moduleName;
	private Integer oview;
	private Integer oedit;
	private Integer oupdate;
	private Integer odelete;
	
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Integer getOview() {
		return oview;
	}
	public void setOview(Integer oview) {
		this.oview = oview;
	}
	public Integer getOedit() {
		return oedit;
	}
	public void setOedit(Integer oedit) {
		this.oedit = oedit;
	}
	public Integer getOupdate() {
		return oupdate;
	}
	public void setOupdate(Integer oupdate) {
		this.oupdate = oupdate;
	}
	public Integer getOdelete() {
		return odelete;
	}
	public void setOdelete(Integer odelete) {
		this.odelete = odelete;
	}
	
	
	
}
