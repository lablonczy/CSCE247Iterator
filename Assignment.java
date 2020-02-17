package CSCE247Iterator;//lukacs ablonczy

/**
 * Defines Assignment objects
 * @author Luke
 */
public class Assignment {
	private String title, description, topic;
	private int points;

	/**
	 * Constr for Assignment type
	 * @param title Name of assn
	 * @param description Desc of assn
	 * @param topic General topic of assn
	 * @param points Number of points assn is worth
	 */
	public Assignment(String title, String description, String topic, int points) {
		this.title = title;
		this.description = description;
		this.topic = topic;
		this.points = points;
	}

	/**
	 * Returns all string attributes of this Assignment
	 * @return A string depiction of all attributes given
	 */
	public String toString() {
		return title + ": " + description + ". Topic: " + topic + " " + points;
	}


}
