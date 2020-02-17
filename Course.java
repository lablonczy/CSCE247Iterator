package CSCE247Iterator;//lukacs ablonczy

public class Course {

	private Assignment[] assignments;
	private int count;
	private String name, title;
	private static final int INITIAL_SIZE = 5, INITIAL_COUNT = 0, CONST_MULT = 2;
	private static final double PERCENT = 100;

	public Course(String name, String title) {
		assignments = new Assignment[INITIAL_SIZE];
		count = INITIAL_COUNT;
		this.name = name;
		this.title = title;
	}

	public void addAssignment(String title, String description, String topic, int points) {
		if (count == assignments.length)
			this.assignments = growArray(assignments);

		assignments[count] = new Assignment(title, description, topic, points);
		count++;
	}

	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}

	public double getAssignmentWeights() {
		return PERCENT / assignments.length;
	}

	public String toString() {
		return name + ": " + title;
	}

	public Assignment[] growArray(Assignment[] first) {
		Assignment[] newArray = new Assignment[assignments.length * CONST_MULT];
		System.arraycopy(assignments, 0, newArray, 0, assignments.length);
		return newArray;
	}

}
