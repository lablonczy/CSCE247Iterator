package CSCE247Iterator;//lukacs ablonczy

import java.util.Iterator;

/**
 * Allows Assignment objects to use iterator
 * @author Luke
 */
public class CourseIterator implements Iterator {

	private Assignment[] assignments;
	private int position;

	/**
	 * Constr for CourseIterator
	 * @param assignments Assignment array to iterate through
	 */
	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
		this.position = -1;
	}

	/**
	 * Checks whether array has a next non null value
	 * @return Whether array has a next non null value
	 */
	public boolean hasNext() {
		return assignments[position + 1] != null && position < assignments.length - 1;
	}

	/**
	 * Returns the assignment following the current one by using position to track current index
	 * @return
	 */
	public Assignment next() {
		position++;

		if (position < assignments.length) {
			return assignments[position];
		} else {
			return null;
		}

	}

}
