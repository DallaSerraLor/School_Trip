
public class Student extends Person{
	private final int sID;
	
	public Student(String name, String surname, String username, String password, int sID) {
		super(name, surname, username,password);
		this.sID = sID;
	}
	
	public int getsID() {
		return this.sID;
	}
	
}