package com.talooz.ms.admin.department.entity;

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
@Table(name = "DEPARTMENT")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departmentId;
	private String departmentName;
	private Integer departmentHeadId;
	private Integer entityId;
	private Integer schoolYearId;
	private Integer obsolete;
	@OneToMany(mappedBy="department",cascade = CascadeType.ALL)
    private List<DepartmentParticulars> departmentParticulars;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getDepartmentHeadId() {
		return departmentHeadId;
	}
	public void setDepartmentHeadId(Integer departmentHeadId) {
		this.departmentHeadId = departmentHeadId;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public Integer getSchoolYearId() {
		return schoolYearId;
	}
	public void setSchoolYearId(Integer schoolYearId) {
		this.schoolYearId = schoolYearId;
	}
	public Integer getObsolete() {
		return obsolete;
	}
	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}
	public List<DepartmentParticulars> getDepartmentParticulars() {
		return departmentParticulars;
	}
	public void setDepartmentParticulars(List<DepartmentParticulars> departmentParticulars) {
		this.departmentParticulars = departmentParticulars;
	}
	
	
}
