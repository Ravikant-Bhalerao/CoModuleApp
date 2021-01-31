package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggers {
	@Id
	@Column(name = "trg_id")
	private Integer trgId;
	@Column(name = "case_num")
	private String caseNumber;
	@Column(name = "create_dt")
	private String createDate;
	@Column(name = "trg_status")
	private String trgStatus;
	@Column(name = "update_dt")
	private String updateDate;
	public Integer getTrgId() {
		return trgId;
	}
	public void setTrgId(Integer trgId) {
		this.trgId = trgId;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getTrgStatus() {
		return trgStatus;
	}
	public void setTrgStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
