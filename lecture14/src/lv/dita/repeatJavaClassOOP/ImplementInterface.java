package lv.dita.repeatJavaClassOOP;

public class ImplementInterface implements InterfaceClass{

	private int countEmail;
	public static void main(String[] args) {
		
	}

	@Override
	public void sendEmail() {
		System.out.println("This is my e-mail");
	}

	@Override
	public int emailCount() {
		countEmail++;
		return countEmail;
	}
	
}
