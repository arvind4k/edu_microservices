package com.talooz.ms.admin.security.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;
	private String roleName;
	private Integer entityId;
	private Integer obsolete;
	@OneToMany(mappedBy="userRole",cascade = CascadeType.ALL)
    private List<UserRoleParticulars> userRoleParticulars;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public Integer getObsolete() {
		return obsolete;
	}
	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}
	public List<UserRoleParticulars> getUserRoleParticulars() {
		return userRoleParticulars;
	}
	public void setUserRoleParticulars(List<UserRoleParticulars> userRoleParticulars) {
		this.userRoleParticulars = userRoleParticulars;
	}
	

	
}
