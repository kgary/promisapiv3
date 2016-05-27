package edu.asu.heal.promisapiv3.model;

import java.util.List;

/**
 * A PROMIS survey represents a single PROMIS form.
 * @author kevinagary
 *
 */
public class PromisSurvey extends LeafActivity {

	private final List<Question> questions;
	private final boolean isRandomizable;
	
	public PromisSurvey(List<Question> qs, boolean r) {
		super();
		// populated from the DB, immutable
		questions = qs;
		isRandomizable = r;
	}

	@Override
	public ActivityInstance generateActivityInstance() {
		// This implementation should compose the list of questions into a
		// JSON collection string usable for the ActivityInstance. It should
		// randomize the questions in the list if the flag is set.
		return null;
	}

}
