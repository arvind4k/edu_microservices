package com.talooz.ms.profiles.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDITIONAL_DETAILS")
public class AdditionalDetails implements Serializable {

	private static final long serialVersionUID = -4175827673666466104L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long additionalInfoId;
	private Long userId;
	private String nationality;
	private String birthPlace;
	private String religion;
	private String caste;
	private String subcaste;
	public Long getAdditionalInfoId() {
		return additionalInfoId;
	}
	public void setAdditionalInfoId(Long additionalInfoId) {
		this.additionalInfoId = additionalInfoId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getSubcaste() {
		return subcaste;
	}
	public void setSubcaste(String subcaste) {
		this.subcaste = subcaste;
	}
}
