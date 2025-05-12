
public class Teacher extends Person{
	private final int tID;

	public Teacher(int tID, String name, String surname, String username, String password) {
		super(name, surname, username,password);
		this.tID = tID;
	}

	public int gettID() {
		return tID;
	}

	@Override
	public String toString() {
		return "Teacher [tID=" + tID + super.toString() + "]";
	}
}
