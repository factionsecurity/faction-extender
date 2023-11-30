package com.faction.extender;

import java.util.HashMap;

public class InventoryResult {
	private String ApplicationId;
	private String ApplicationName;
	private String	DistrobutionList;
	private HashMap<String,String> CustomFields = new HashMap<String,String>();
	
	/**
	 * @return Returns the Application Id
	 */
	public String getApplicationId() {
		return ApplicationId;
	}
	/**
	 * @return Returns the Application Name
	 */
	public String getApplicationName() {
		return ApplicationName;
	}
	/**
	 * @return Returns the a key value pair of custom fields. 
	 * The key must be an exact match to the variable name in Faction
	 */
	public HashMap<String, String> getCustomFields() {
		return CustomFields;
	}

	/**
	 * @param applicationId is the ID of the application. This is not the Faction Database ID
	 */
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	/**
	 * @param applicationName Is the Name of the Application
	 */
	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}
	/**
	 * @param customFields key value pairs where the key must match to a custom variable name in Faction
	 */
	public void setCustomFields(HashMap<String, String> customFields) {
		CustomFields = customFields;
	}
	/**
	 * return a distribution list the is a string of email addresses separated by a ';'
	 */
	public String getDistrobutionList() {
		return DistrobutionList;
	}
	/**
	 * @param distrobutionList is a string of email addresses separated by a ';'
	 */
	public void setDistrobutionList(String distrobutionList) {
		DistrobutionList = distrobutionList;
	}
	
	
	
	

}
