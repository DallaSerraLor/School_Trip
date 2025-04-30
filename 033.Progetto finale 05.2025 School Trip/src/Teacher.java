
public class Teacher extends Person{
	private final int tID;

	public Teacher(String name, String surname, String username, String password, int tID) {
		super(name, surname, username,password);
		this.tID = tID;
	}

	public int gettID() {
		return tID;
	}
	
	
	
}
