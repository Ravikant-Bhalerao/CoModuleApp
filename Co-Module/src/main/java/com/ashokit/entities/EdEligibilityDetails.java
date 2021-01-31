package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ED_ELIGIBILITY_DETAILS")
public class EdEligibilityDetails {
	@Id
	@Column(name = "ed_trace_id")
	private Integer edTraceId;
	@Column(name = "benefit_amt")
	private Double benifitAmt;
	@Column(name = "case_num")
	private Integer caseNumber;
	@Column(name = "create_dt")
	private String createDate;
	@Column(name = "denial_reason")
	private String denialReason;
	@Column(name = "plan_end_dt")
	private String planEndDate;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "plan_start_dt")
	private String palanStartDate;
	@Column(name = "plan_status")
	private String planStatus;
	@Column(name = "update_dt")
	private String updateDate;
	public Integer getEdTraceId() {
		return edTraceId;
	}
	public void setEdTraceId(Integer edTraceId) {
		this.edTraceId = edTraceId;
	}
	public Double getBenifitAmt() {
		return benifitAmt;
	}
	public void setBenifitAmt(Double benifitAmt) {
		this.benifitAmt = benifitAmt;
	}
	public Integer getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public String getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPalanStartDate() {
		return palanStartDate;
	}
	public void setPalanStartDate(String palanStartDate) {
		this.palanStartDate = palanStartDate;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
