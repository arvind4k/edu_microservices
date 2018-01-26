package com.talooz.ms.profiles.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARENT_DETAILS")
public class ParentDetails implements Serializable {

	private static final long serialVersionUID = -4175827673666466104L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long guardianId;
	private Long userId;
	private String relationship;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String mobile;
	private String qualification;

	public ParentDetails(Long guardianId, Long userId, String relationship, String firstName, String lastName,
			String email, String phone, String mobile, String qualification) {
		super();
		this.guardianId = guardianId;
		this.userId = userId;
		this.relationship = relationship;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
		this.qualification = qualification;
	}

	public ParentDetails() {
	}

	public Long getGuardianId() {
		return guardianId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getRelationship() {
		return relationship;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getMobile() {
		return mobile;
	}

	public String getQualification() {
		return qualification;
	}

}
