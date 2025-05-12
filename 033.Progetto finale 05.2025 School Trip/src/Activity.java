
public class Activity {//manages activity to be made in a Trip
	private final int aID;
	private final String name;
	private final int duration;
	private final String location;
	private final int scheduled_time;//not sure
	private final int max_partecipant;
	private int num_of_partecipant;
	
	public Activity(int aID, String name, int duration, String location, int scheduled_time, int max_partecipant, int num_of_partecipant) {
		super();
		this.aID = aID;
		this.name = name;
		this.duration = duration;
		this.location = location;
		this.scheduled_time = scheduled_time;
		this.max_partecipant = max_partecipant;
		this.num_of_partecipant = num_of_partecipant;
	}

	public int getaID() {
		return aID;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getLocation() {
		return location;
	}

	public int getScheduled_time() {
		return scheduled_time;
	}

	public int getMax_partecipant() {
		return max_partecipant;
	}

	public int getNum_of_partecipant() {
		return num_of_partecipant;
	}

	@Override
	public String toString() {
		return "Activity [aID=" + aID + ", name=" + name + ", duration=" + duration + ", location=" + location
				+ ", scheduled_time=" + scheduled_time + ", max_partecipant=" + max_partecipant
				+ ", num_of_partecipant=" + num_of_partecipant + "]";
	}
}
