package edu.asu.heal.promisapiv3.model;

/**
 * The ActivityInstance model object represents 
 * @author kevinagary
 *
 */
public final class ActivityInstance {

	private final String activityInstanceId;
	
	public ActivityInstance(String aid) throws Exception {
		// Initialize existing one from DAO
		activityInstanceId = aid;
		// XXX Get it from the DAO
	}
	
	/**
	 * Factory method. This creates the instance and persists it through the DAO
	 */
	public static ActivityInstance createActivityInstance(Activity a, Patient p /*, Clinician c*/) throws Exception {
		return null;
	}

}
