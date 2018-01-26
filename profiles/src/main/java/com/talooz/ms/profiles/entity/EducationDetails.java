package com.talooz.ms.profiles.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDUCATION_DETAILS")
public class EducationDetails implements Serializable {

	private static final long serialVersionUID = -4175827673666466104L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long educationId;
	private Long userId;
	private String course;
	private String grade;
	private String score;
	private String institution;
	private String university;
	private Integer passingYear;
	private Integer obsolete;

	public EducationDetails(Long educationId, Long userId, String course, String grade, String score,
			String institution, String university, Integer passingYear, Integer obsolete) {
		super();
		this.educationId = educationId;
		this.userId = userId;
		this.course = course;
		this.grade = grade;
		this.score = score;
		this.institution = institution;
		this.university = university;
		this.passingYear = passingYear;
		this.obsolete = obsolete;
	}

	public EducationDetails() {
	}

	public Long getEducationId() {
		return educationId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getCourse() {
		return course;
	}

	public String getGrade() {
		return grade;
	}

	public String getScore() {
		return score;
	}

	public String getInstitution() {
		return institution;
	}

	public String getUniversity() {
		return university;
	}

	public Integer getPassingYear() {
		return passingYear;
	}

	public Integer getObsolete() {
		return obsolete;
	}

}
