/**
 * 
 */
package edu.asu.heal.promisapiv3.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/patients")
@Produces(MediaType.APPLICATION_JSON)
public class Patient {
	/**
	 * Fetches an individual Patient by PIN
	 * @param pin
	 * @return
	 */
	@GET
	@Path("{pin}")
	public Response getPatient(@PathParam("pin") String pin) {
		return null;
	}
	
	/**
	 * Not fully specified. An example showing possible filter params on a collection of patients
	 * @param trial
	 * @param compliance ask for patients above or below a given compliance level
	 * @param used in conjunction with previous param
	 * @param includeDeleted should we include deactivated patients?
	 * @param stage
	 * @return
	 */
	@GET
	public Response getPatients(
			@QueryParam("trial") int trial,
			@QueryParam("compliance") float complianceLevel,
			@DefaultValue("false") @QueryParam("above") boolean above,
			@QueryParam("includeDeleted") boolean includeDeleted,
			@QueryParam("stage") int stage) {
		return null;
	}
			
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postPatient() {
		// set the Location header if the patient was created
	}
	
	/**
	 * Normally we'd do PATCH not PUT on a Patient but Jersey doesn't support PATCH out of the box
	 * @param pin
	 * @return
	 */
	@PUT
	@Path("{pin}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response putPatient(@PathParam("pin") String pin) {
		// update the patient
		return null;
	}
	
	/**
	 * Patuents are never fully deleted, they are only deactivated
	 */
	@DELETE
	public void deletePatient() {
		// In reality this should just deactivate the patient
	}
}