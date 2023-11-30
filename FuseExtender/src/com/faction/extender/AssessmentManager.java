package com.faction.extender;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;


public interface AssessmentManager {
	static public enum Operation { Create, Update, Delete, 
		Finalize, PeerReviewCreated, PeerReviewCompleted,
		PeerReviewAccepted};
	
	
	/**
	 * This function allows you to update other interfaces when the command is run. This can also up
	 * 
	 * 
	 * @param asmt is the Current assessment
	 * @param vulns is the list of vulnerabilities that is related to this assessment. Will be 
	 * 		null if the Operation is Create. 
	 * @param Operation is Create Update or Delete as defined by the Operation Static variable 
	 */
	public Object [] assessmentChange(Assessment asmt, List<Vulnerability> vulns, Operation Operation);
	
	


}
