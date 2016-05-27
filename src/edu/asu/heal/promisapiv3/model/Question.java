package edu.asu.heal.promisapiv3.model;

/**
 * A Question represents a survey question of some type. These could be questions
 * that appear on a PROMIS form, related to medication adherence, in-game question,
 * computer-adaptive testing etc. The Question could also be of just about any type,
 * such as MCSA, MCMA, Likert, multipart. The Java object is just a passthrough from
 * the database via JSON, so we aren't creating subtypes right now. It is immutable.
 * @author kevinagary
 *
 */
public class Question implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 939394312806437709L;

	// We could make this extensible via a properties file but we'll wait on that
	public enum Type {
		LIKERT5, LIKERT7, LIKERT10, MCSA, MCMA, RATING, PAIN_INTENSITY, CUSTOM
	}
	
	private final String questionId;
	private final Question.Type questionType;
	private final String questionStem; // JSON of the text of the question
	private final String questionMetadata;  // JSON with a metadata structure the app may understand
	
	public Question(String id, Question.Type type, String stem, String md) {
		// populated from DB
		questionId = id;
		questionType = type;
		questionStem = stem;
		questionMetadata = md;
	}

	public String getQuestionId() {
		return questionId;
	}

	public Question.Type getQuestionType() {
		return questionType;
	}

	public String getQuestionStem() {
		return questionStem;
	}

	public String getQuestionMetadata() {
		return questionMetadata;
	}
}
