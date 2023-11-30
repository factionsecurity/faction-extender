package com.faction.interfaces;

import java.util.Date;
import java.util.List;

public abstract class _Assessment {


	
	public abstract Long getId();
	public abstract String getSummary();
	public abstract void setSummary(String summary);
	public abstract String getRiskAnalysis();
	public abstract void setRiskAnalysis(String riskAnalysis);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract _User getEngagement();
	public abstract void setEngagement(_User engagement);
	public abstract List<_User> getAssessor();
	public abstract void setAssessor(List<_User> assessor);
	public abstract List<_Vulnerability> getVulns();
	public abstract void setVulns(List<_Vulnerability> vulns);
	public abstract String getAppId();
	public abstract void setAppId(String appId);
	public abstract Date getStart();
	public abstract void setStart(Date start);
	public abstract Date getEnd();
	public abstract void setEnd(Date end);
	public abstract Date getCompleted();
	public abstract void setCompleted(Date completed);
	public abstract List<_CustomField> getCustomFields();
	public abstract void setCustomFields(List<_CustomField> customFields);
	public abstract String getNotes();
	public abstract void setNotes(String notes);
	public abstract String getDistributionList();
	public abstract void setDistributionList(String distributionList);
	public abstract String getAccessNotes();
	public abstract void setAccessNotes(String accessNotes);
	public abstract _User getRemediation();
	public abstract void setRemediation(_User remediation);
	
	public abstract _AssessmentType getType();
	public abstract Object getFinalReport();
	public abstract _Campaign getCampaign();
	public abstract String getPr_sum_notes();
	public abstract String getPr_risk_notes();
	public abstract String getGuid();
	public abstract _FinalReport getRetestReport();
	
	

}
