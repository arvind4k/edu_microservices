package com.talooz.ms.profiles.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENTS")
public class Document implements Serializable {

	private static final long serialVersionUID = -4175827673666466104L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long documentId;
	private Long userId;
	private String documentName;
	private String documentNumber;
	private String issuedBy;
	private String validUntil;
	private String documentPath;
	private Integer obsolete;

	public Document(Long documentId, Long userId, String documentName, String documentNumber, String issuedBy,
			String validUntil, String documentPath, Integer obsolete) {
		this.documentId = documentId;
		this.userId = userId;
		this.documentName = documentName;
		this.documentNumber = documentNumber;
		this.issuedBy = issuedBy;
		this.validUntil = validUntil;
		this.documentPath = documentPath;
		this.obsolete = obsolete;
	}

	public Document() {
	}

	public Long getDocumentId() {
		return documentId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public Integer getObsolete() {
		return obsolete;
	}
	
}
