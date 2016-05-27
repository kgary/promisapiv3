package edu.asu.heal.promisapiv3.model;

import java.util.ArrayList;
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
	
	// YYY need our own Exception type here
	private void __init(List<Activity> activities, Sequencing s) throws Exception {
		if (activities == null || activities.size() < 2) throw new Exception("Container activities must have at least 2 children");
		// we intentionally do not deep clone
		__subActivities = activities;
		__sequencing = s;
		// We assume this is being populated from a persistent store via a DAO somehow
	}
	
	public ContainerActivity(Activity child1, Activity child2, ContainerActivity.Sequencing seq) throws Exception {
		super();
		List<Activity> tempList = new ArrayList<Activity>();
		tempList.add(child1);
		tempList.add(child2);
		__init(tempList, seq);
	}
	
	public ContainerActivity(List<Activity> children, ContainerActivity.Sequencing seq) throws Exception {
		super();
		__init(children, seq);
	}
	
	// factory method, we'll get back to this
	public ActivityInstance generateActivityInstance() {
		return null;
	}
}
