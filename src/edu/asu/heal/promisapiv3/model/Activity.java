package edu.asu.heal.promisapiv3.model;

/**
 * This is a model object that should support JAXB bindings for our REST services
 * @author kevinagary
 *
 */
public abstract class Activity {
	protected String _activityId;

	protected Activity() {
		_activityId = "foo1";  // a factory needs to inject this later
	}
	// getters, setters, etc. below
	
	// factory method, we'll get back to this
	public abstract ActivityInstance generateActivityInstance();
}
