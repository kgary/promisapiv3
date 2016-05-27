package edu.asu.heal.promisapiv3.model;

/**
 * Incomplete POJO describing a patient
 * @author kevinagary
 *
 */
public class Patient {

	private String patientPin = null;
	private String createdByUserId = null;
	private String tsCreated = null;		// when the Patient was created
	private String trialId = null;			// clinical trial the Patient is in
	private String stageId = null;			// stage of the protocol
	
	/**
	 * Constructor that uses the DAO to populate
	 * @param pin
	 * @return
	 * @throws Exception
	 */
	public Patient(String pin) throws Exception {
		// delegate to the DAO to get a PatientVO object, Exception on error or no such Patient
		// something like PatientVO pvo = theDAO.getPatient(pin); then invoke constructor?
		patientPin = pin;
	}

	public Patient(String cid, String tid, String sid) throws Exception {
		// invoke the DAO to get a PatientVO
		createdByUserId = cid;
		trialId = tid;
		stageId = sid;
		PatientVO pvo = new PatientVO();
		// By using an inner class we control who gets a PatientVO
		//theDAO.createPatient(pvo, createdById, tid, sid);
		//patientPin = pvo.pin;
		//tsCreated = pvo.tsCreated;
	}

	public class PatientVO {
		public String pin;
		public String tsCreated;
		private PatientVO() {}
	}
	
	public String getPatientPin() {
		return patientPin;
	}

	public String getCreatedByUserId() {
		return createdByUserId;
	}

	public String getTsCreated() {
		return tsCreated;
	}

	public String getTrialId() {
		return trialId;
	}

	public String getStageId() {
		return stageId;
	}
}
