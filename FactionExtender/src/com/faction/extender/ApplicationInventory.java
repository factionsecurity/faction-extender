package com.faction.extender;



public interface ApplicationInventory {
	
	/**
	 * This is an interface for the Faction API that allows
	 * Developers to create their own integrations with other
	 * systems. 
	 * 
	 * The search feature allow developers to query other sources
	 * of data to obtain a listing of applications. This method is
	 * called any time an application is searched in the Faction
	 * web application. For example when scheduling or uploading 
	 * assessments.
	 * 
	 * @param id is a unique identifier for the application
	 * @param Name is the name of the application
	 * @return InvetoryResult[] is an array of Applications
	 */
	public InventoryResult[]  search(String id, String Name);

}
