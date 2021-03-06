package com.talooz.ms.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class ApplicationUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getProfileComplete() {
		return profileComplete;
	}

	public void setProfileComplete(Integer profileComplete) {
		this.profileComplete = profileComplete;
	}

	public Integer getTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(Integer termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}
}
