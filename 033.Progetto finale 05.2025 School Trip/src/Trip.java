import java.util.ArrayList;

public class Trip {
	private final int gID;
	private final String name;
	private ArrayList<Activity> list_of_activity;
	
	
	public Trip(int gID, String name, ArrayList<Activity> list_of_activity) {
		super();
		this.gID = gID;
		this.name = name;
		this.list_of_activity = list_of_activity;
	}

	public int getgID() {
		return gID;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Activity> getList_of_activity() {
		return list_of_activity;
	}

	@Override
	public String toString() {
		return "Trip [gID=" + gID + ", name=" + name + ", list_of_activity=" + list_of_activity + "]";
	}	
}
