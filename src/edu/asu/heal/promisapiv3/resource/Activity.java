package edu.asu.heal.promisapiv3.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * An Activity represents both discrete tasks a Patient is asked to perform as part of a
 * protocol (or specifically, within a stage of the protocol), and combinations of these
 * tasks into high-order tasks that will be delivered together under some constraints or 
 * schedule. An Activity is a template used to instantiate ActivityInstances.
 * @author kevinagary
 *
 */
@Path("/activity")
@Produces(MediaType.APPLICATION_JSON)
public class Activity {

	@GET
	public Response getActivities(
			@QueryParam("stage") String stageId,
			@DefaultValue("false") @QueryParam("isRoot") boolean isRoot,
			@DefaultValue("false") @QueryParam("isLeaf") boolean isLeaf
		) {
		return null;
	}
	
	@GET
	@Path("{activityId}")
	public Response getActivity(@PathParam("activityId") String activityId) {
		return null;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postActivity(String payload) {  // need JAXB here
		// The json we accept should be arbitrarily complex, meaning a single task all
		// the way up to a complex tree
	}
}
