package CSCE247Iterator;//lukacs ablonczy

import java.util.Iterator;

public class CourseIterator implements Iterator {

	private Assignment[] assignments;
	private int position;

	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
		this.position = -1;
	}

	public boolean hasNext() {
		return position < assignments.length - 1 && assignments[position + 1] != null;
	}

	public Assignment next() {

		if (position < assignments.length - 1) {
			position++;
			return assignments[position];
		} else {
			position++;
			return null;
		}

	}

}
