package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH_SUMMARY")
public class BatchSummary {
	@Id
	@Column(name = "SUMMARY_ID")
	private Integer summaryId;
	@Column(name = "BATCH_NAME")
	private String batchname;
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Integer SuccessTriggerCount;
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;
	public Integer getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}
	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}
	public Integer getSuccessTriggerCount() {
		return SuccessTriggerCount;
	}
	public void setSuccessTriggerCount(Integer successTriggerCount) {
		SuccessTriggerCount = successTriggerCount;
	}
	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}
	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}
	

}
