
public class Person {
	private final String name;
	private final String surname;
	private final String username;
	private final String password;
	
	protected Person(String name, String surname, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
	}
	
	public boolean psw_is_correct(String psw)
	{
		return psw == this.password;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", surname=" + surname + ", username=" + username + ", password=" + password
				+ "]";
	}
}