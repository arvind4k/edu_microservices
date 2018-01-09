package com.talooz.ms.profiles.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USERS")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String username;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String gender;
	private Integer obsolete;
	private String email;
	private String phone;
	private String mobile;
	private String profileImage;
	private Long entityId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updationDate;
	private Integer profileComplete;
	private Integer termsAndCondition;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getObsolete() {
		return obsolete;
	}
	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
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
	public Integer getTermsAndCondition() {
		return termsAndCondition;
	}
	public void setTermsAndCondition(Integer termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}
	public Integer getProfileComplete() {
		return profileComplete;
	}
	public void setProfileComplete(Integer profileComplete) {
		this.profileComplete = profileComplete;
	}
}
