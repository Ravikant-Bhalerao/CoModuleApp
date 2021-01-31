package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_PDFS")
public class CoPdfs {
	@Id
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_STATUS")
	private String planestatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Column(name = "PDF_DOCUMENT")
	private Byte pdfDocument;
	@Column(name = "PLAN_NAME")
	private String planName;
	public Integer getCoPdfId() {
		return coPdfId;
	}
	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}
	public String getPlanestatus() {
		return planestatus;
	}
	public void setPlanestatus(String planestatus) {
		this.planestatus = planestatus;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Byte getPdfDocument() {
		return pdfDocument;
	}
	public void setPdfDocument(Byte pdfDocument) {
		this.pdfDocument = pdfDocument;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	

}
