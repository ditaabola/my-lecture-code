package lv.dita.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char genderName) {
		this.name = name;
		this.email = email;
		if (checkGender(genderName)) {
			this.gender = genderName;
		} else {
			this.gender = 'x';
		}
	}

	public static boolean checkGender(char gender) { // viss, kas atrodas iekavaas, attiecas tikai uz metodi
		char male = 'm';
		char female = 'f';
		if (male == gender || female == gender) {
			return true;
		} else {
			return false;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return this.name;
	}
}
