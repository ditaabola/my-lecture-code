package lv.dita;

public class RefactorMethod {

	public static void main(String[] args) {
		
	
//		if(time <= 8){
//		 System.out.println("Good morning.");
//		
//		 }else if(time <= 18){
//		 System.out.println("Good day.");
//		
//		 }else{
//		 System.out.println("Good evening.");
		getGreeting(3);
		System.out.println(getGreeting(3));
		getGreetingVoid(15);
}
		
	public static String getGreeting(int time){
		if(time <= 8){
		return "Good morning.";
		
		}else if(time <= 18){
		return "Good day.";

		}else{
		return "Good evening.";
		}
		
			}

	public static void getGreetingVoid(int time){
	if(time <= 8){
		 System.out.println("Good morning.");
		
		 }else if(time <= 18){
		 System.out.println("Good day.");
		
		 }else{
		 System.out.println("Good evening.");	
	}
	}
	}
