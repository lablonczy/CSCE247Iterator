package CSCE247Iterator;//lukacs ablonczy

import java.util.Iterator;

public class CourseIterator implements Iterator {

	private Assignment[] assignments;
	private int position;

	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
		this.position = 0;
	}

	public boolean hasNext() {
		return position < assignments.length - 1;
	}

	public Assignment next() {
		if (position < assignments.length - 1) {
			position++;
			return assignments[position + 1];
		} else
			return null;
	}

}
