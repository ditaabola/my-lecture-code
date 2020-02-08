import java.util.ArrayList;
import java.util.Arrays;


public class Homeworkraimonds {

	public static void main(String[] args) {
		int[] arr1 = {2, 3, 5, 6};
		int[] arr2 = {2, 3, 7, 8, 9};
		
		ArrayList<Integer>arrList=new ArrayList<>();
		
		for(int i: arr1){
			for(int j:arr2){
				if(i == j){
					arrList.add(i);
					break;
					
				}
		}
	}
		System.out.println(Arrays.asList(arrList));
	}
}
