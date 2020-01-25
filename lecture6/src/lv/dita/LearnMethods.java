package lv.dita;

public class LearnMethods {

	// void - non-return type
	// static - nevajag veidot klases objektu, lai izsauktu metodi
	// public - modifier (veel ir private un protected, nosaka to, kaa metodes
	// ir pieejamas)
	public static void main(String[] args) {

		getMyName();
		System.out.println("------------------------------------------");
		getMyCity();
		LearnMethods classObject = new LearnMethods();
		classObject.doYouHaveCat();
	}

	public static void getMyName() {
		System.out.println("My name is Dita");
	}

	public static void getMyCity() {
		getMyName();
		System.out.println("My city is Lielvarde");

	}

	public void doYouHaveCat() {
		System.out.println("No");

	}

}
