package edu.asu.heal.promisapiv3.model;

import java.util.List;

/**
 * A ContainerActivity will represent a container of other nodes in an activity tree.
 * It may be a root node itself or be referenced by another ContainerActivity. It
 * must have 2 or more sub activities, which themselves may be ContainerActivity
 * objects or LeadActivity objects.
 * @author kevinagary
 *
 */
public class ContainerActivity extends Activity {
	public enum Sequencing {
		ORDER, RANDOM, INTERLEAVE_ORDER, INTERLEAVE_RANDOM
	}
	
	private List<Activity> __subActivities;
	private ContainerActivity.Sequencing __sequencing;
	
	public ContainerActivity() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	// factory method, we'll get back to this
	public ActivityInstance generateActivityInstance() {
		return null;
	}
}
