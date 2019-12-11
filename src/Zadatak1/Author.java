package Zadatak1;

public class Author {
	private String name;
	private String email;
	private char gender;

	Author() {

	}

	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	// geteri
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	// seteri
	public void setEmail(String email) {
		this.email = email;
	}

}
