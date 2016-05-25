package edu.asu.heal.promisapiv3.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * Haven't added GET methods to retrieve log info or scored activity data by patient as
 * I'm not quite sure yet which way that part of the API should be navigated.
 * Right now this assumes we only get activities per Patient but that may be wrong. 
 */

/**
 * An ActivityIntance is an instantiated version of an Activity tree. As such is represents
 * something a Patient actually does, including the order in which s/he does it. An instance
 * that is in the queue to be performed by a Patient is in the state Scheduled, and such an
 * instance is either not in its active window yet (can't be completed yet), is in its
 * active window (should get a button on the landing page), or has expired (Patient did not
 * do it in the active window). When the Patient completes the instance it is changed to a
 * "Completed" state. So ActivityInstances have a simple state model.
 * An ActivityInstance is either a single discrete delievred event (like a simple gameplay)
 * or a 1-level "bush" that defines the sequence of delivered events as one unit.
 * @author kevinagary
 *
 */
@Path("/activities/{pin}")
@Produces(MediaType.APPLICATION_JSON)
public class ActivityInstance {
	/**
	 * return the activities scheduled for the patient, not exactly sure if we can have 
	 * activities that are not active (expired or in future) but including due to cron job legacy
	 * @param pin
	 * @param isActive a flag that forces return of only those activities currently active
	 * @return
	 */
	@GET
	public Response getScheduledActivities(
			@PathParam("pin") String pin,
			@DefaultValue("true") boolean isActive
		) {
		return null;
	}
	
	/**
	 * Get all activities completed by a given Patient PIN
	 * @param pin
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@GET
	public Response getCompletedActivities(
			@PathParam("pin") String pin,
			@QueryParam("startDate") String startDate,
			@QueryParam("endDate") String endDate
		) {
		return null;
	}
	
	/**
	 * Get all activities completed by a given Patient PIN
	 * @param pin
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@GET
	public Response getExpiredActivities(
			@PathParam("pin") String pin,
			@QueryParam("startDate") String startDate,
			@QueryParam("endDate") String endDate
		) {
		return null;
	}
	
	/**
	 * Create a new scheduled activity for patient. May not need a payload.
	 * @param pin
	 * @param activityId
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{activityId}")
	public void postScheduledActivity(
			@PathParam("pin") String pin,
			@PathParam("activityId") String activityId
		)	{
		// set the Location Header if successful
	}
	
	/**
	 * Indicates Patient has completed the specified scheduled activity instance.
	 * The JSON should include log data and score data and be dependent on Activity type
	 * @param pin
	 * @param scheduledActivityId
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{scheduledActivityId}")
	public void postCompletedActivity(
			@PathParam("pin") String pin,
			@PathParam("scheduledActivityId") String scheduledActivityId
		)	{
		// set the Location Header if successful
		// may want to check if it was already completed as error case
	}
	
	/**
	 * Delete an activity instance from the instance table. We may want to consider a 409 here
	 * @param pin
	 * @param activityId
	 */
	@DELETE
	@Path("{scheduledActivityId}")
	public void deleteScheduledActivity(
			@PathParam("pin") String pin,
			@PathParam("scheduledActivityId") String activityId
		)	{
		// return 204 with empty payload if successful
		// should we return a 409 if the activity has been started? already completed?
	}
	
	// A DELETE on a completed activity should return a 409 (405?)
}
