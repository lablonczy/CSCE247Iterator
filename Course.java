package CSCE247Iterator;//lukacs ablonczy

/**
 * Controls Assignment objects
 * @author Luke
 */
public class Course {

	private Assignment[] assignments;
	private int count;
	private String name, title;
	private static final int INITIAL_SIZE = 5, INITIAL_COUNT = 0, CONST_MULT = 2;
	private static final double PERCENT = 100;

	/**
	 * Construct for Course type
	 * @param name The official name of the course
	 * @param title Description of the course
	 */
	public Course(String name, String title) {
		assignments = new Assignment[INITIAL_SIZE];
		count = INITIAL_COUNT;
		this.name = name;
		this.title = title;
	}

	/**
	 * Adds assignment to assignments
	 * @param title Name of the assignment
	 * @param description Desc of the assn
	 * @param topic Topic of assn
	 * @param points num of points assn is worth
	 */
	public void addAssignment(String title, String description, String topic, int points) {
		if (count == assignments.length)
			this.assignments = growArray(assignments);

		assignments[count] = new Assignment(title, description, topic, points);
		count++;
	}

	/**
	 * For use to iterate through assignments
	 * @return new CourseIterator type
	 */
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}

	/**
	 * Returns the name and title of the course
	 * @return the name and title of the course
	 */
	public String toString() {
		return name + ": " + title;
	}

	/**
	 * returns the weight each assn has on the final grade
	 * @return 100/ num of assn
	 */
	public double getAssignmentWeights() {
		return PERCENT / count;
	}

	/**
	 * If assignments has reached a new point on 5*2^n, the size of the array will be doubled via copy and paste into a new array of the increased size
	 * @param first the original array which is full
	 * @return the new array which should be half full
	 */
	public Assignment[] growArray(Assignment[] first) {
		Assignment[] newArray = new Assignment[assignments.length * CONST_MULT];
		System.arraycopy(assignments, 0, newArray, 0, assignments.length);
		return newArray;
	}

	/**
	 * returns assn for Testing
	 * @return assignments
	 */
	public Assignment[] getAssignments() {
		return assignments;
	}

	/**
	 * returns count for Testing
	 * @return count
	 */
	public int getCount(){
		return count;
	}
}
