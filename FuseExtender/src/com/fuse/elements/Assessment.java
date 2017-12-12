package com.fuse.elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import com.fuse.elements.User;
public class Assessment{

	
	private String summary;
	private String riskAnalysis;
	private String name;
	private User engagementContact;
	private List<User>assessors;
	private User remediationContact;
	private String appId;
	private Date start;
	private Date end;
	private Date completed;
	private String Notes;
	private String DistributionList;
	private String AccessNotes;
	private String type;
	private byte [] finalReport;
	private String campaign;
	private String pr_sum_notes;
	private String pr_risk_notes;
	private String status;
	private Integer workflow;


		

	public String getSummary() {
		return summary;
	}
	
	public String getRiskAnalysis() {

		return this.riskAnalysis;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Date getCompleted() {
		return completed;
	}
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	public String getNotes() {
		return Notes;
	}
	
	public String getDistributionList() {
		return DistributionList;
	}
	public void setDistributionList(String distributionList) {
		DistributionList = distributionList;
	}
	public String getAccessNotes() {
		return AccessNotes;
	}
	
	public String getPr_sum_notes() {
		return pr_sum_notes;
	}
	
	public String getPr_risk_notes() {
		return pr_risk_notes;
	}
	
	public String getType() {
		return type;
	}
	public byte[] getFinalReport() {
		return finalReport;
	}
	public String getCampaign() {
		return campaign;
	}
	public User getEngagementContact() {
		return engagementContact;
	}
	public User getRemediationContact() {
		return remediationContact;
	}
	public void setEngagementContact(User engagementContact) {
		this.engagementContact = engagementContact;
	}
	public void setRemediationContact(User remediationContact) {
		this.remediationContact = remediationContact;
	}
	public List<User> getAssessors() {
		return assessors;
	}
	public void setAssessors(List<User> assessors) {
		this.assessors = assessors;
	}
	public String getStatus() {
		return status;
	}
	public Integer getWorkflow() {
		return workflow;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setRiskAnalysis(String riskAnalysis) {
		this.riskAnalysis = riskAnalysis;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public void setAccessNotes(String accessNotes) {
		AccessNotes = accessNotes;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFinalReport(byte[] finalReport) {
		this.finalReport = finalReport;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public void setPr_sum_notes(String pr_sum_notes) {
		this.pr_sum_notes = pr_sum_notes;
	}

	public void setPr_risk_notes(String pr_risk_notes) {
		this.pr_risk_notes = pr_risk_notes;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setWorkflow(Integer workflow) {
		this.workflow = workflow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


	
	
	
	
	
	

	
	
	

}
