package edu.asu.heal.promisapiv3.model;

/**
 * A leaf activity represents a definable task for a Patient to do, It cannot
 * have child activities. As a discrete tasks, there should be logioc in here
 * for how the task interactions are tracked and how the task is scored.
 * Subclasses of this type may be used to add semantics around specific 
 * task types (a survey, a game activity, etc.
 * @author kevinagary
 *
 */
public class LeafActivity extends Activity {

	public LeafActivity() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public ActivityInstance generateActivityInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
