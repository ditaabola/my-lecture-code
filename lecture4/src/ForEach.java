
public class ForEach {

	public static void main(String[] args) {
		int[] marks = {76, 23, 42, 10, 56, 75};
		//For-each loop for(var : arrays)
		for(int mark : marks){
		System.out.println(mark);	
		
		System.out.println("-----------------------");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		}	
	}
}
