
public class Student extends Person{
	private final int sID;
	
	public Student(int sID, String name, String surname, String username, String password) {
		super(name, surname, username,password);
		this.sID = sID;
	}
	
	public int getsID() {
		return this.sID;
	}
	
	@Override
	public String toString() {
		return "Student[sID=" + sID + super.toString() + "]";
	}
}