package com.talooz.ms.security.auth;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 1250166508152483573L;

	private final String token;
	private final String username;
	private final Long userId;
	private final String firstName;
	private final String lastName;
	private final Long schoolYearId;
	private final String schoolYear;
	private final Long eorgId;
	private final Integer profileCompelte;

	public JwtAuthenticationResponse(String token, String username, Long userId, String firstName, String lastName,
			Long schoolYearId, String schoolYear, Long eorgId, Integer profileComplete) {
		this.token = token;
		this.username = username;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolYearId = schoolYearId;
		this.schoolYear = schoolYear;
		this.eorgId=eorgId;
		this.profileCompelte=profileComplete;
	}

	public String getToken() {
		return this.token;
	}

	public String getUsername() {
		return username;
	}

	public Long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getSchoolYearId() {
		return schoolYearId;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public Long getEorgId() {
		return eorgId;
	}

	public Integer getProfileCompelte() {
		return profileCompelte;
	}
}
