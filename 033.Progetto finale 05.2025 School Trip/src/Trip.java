import java.util.ArrayList;

public class Trip {
	private final int trID;
	private final String name;
	private ArrayList<Activity> list_of_activity;
	
	
	public Trip(int trID, String name, ArrayList<Activity> list_of_activity) {
		super();
		this.trID = trID;
		this.name = name;
		this.list_of_activity = list_of_activity;
	}

	public int gettrID() {
		return trID;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Activity> getList_of_activity() {
		return list_of_activity;
	}

	@Override
	public String toString() {
		return "Trip [trID=" + trID + ", name=" + name + ", list_of_activity=" + list_of_activity + "]";
	}	
}
