package com.talooz.ms.profiles.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_SCHOOL_DETAILS")
public class SchoolDetails implements Serializable {

	private static final long serialVersionUID = -4175827673666466104L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentSchoolId;
	private Long userId;
	private Integer courseId;
	private Integer sectionId;
	private Date enrollmentDate;
	
	public Long getStudentSchoolId() {
		return studentSchoolId;
	}
	public void setStudentSchoolId(Long studentSchoolId) {
		this.studentSchoolId = studentSchoolId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
}
