package com.fuse.extender;

import java.util.Date;

import com.fuse.elements.Assessment;
import com.fuse.elements.User;
import com.fuse.elements.Vulnerability;
import com.fuse.extender.AssessmentManager.Operation;

public interface VerificationManager {
	static public enum Operation { Cancel, PASS,FAIL,Assigned};
	
	/**
	 * @param changer is the user that changed the vulnerability
	 * @param vuln is the vulnerability that is being modified
	 * @param Assessor added notes when verification is passed or failed.
	 * @param start is the start date for the verification
	 * @param end is the end date for the verification
	 * @param Operation is Create Update or Delete as defined by the Operation Static variable
	 * @return All Operations return the updated vulnerability. If return value is null then 
	 * Faction will not update the internal database.
	 * 
	 */
	public void verificationChange(User changer, Vulnerability vuln, String AssessorNotes, Date start, Date end, Operation Operation);
	
	
}
