package lv.dita;

public class TestArraysandLists {

	public static void main(String[] args) {

		String[] arr = new String[10];
		String[] arrWidth = { "A", "B", "C", "D", "E", "F", "G" };
		for (int i = 0; i < arr.length; i++){
	}
	arrToString(arr);
	arrToString(arrWidth);
	addElementToArr(arr);
	}
public static void arrToString(String[] arr){
	for(int i = 0; i<arr.length; i++){
		System.out.println("index number are "+ i+" "+arr[i] );
	}
}
public static void addElementToArr(String [] arrWidth){

	for(int i = 0; i<arrWidth.length; i++){
	arrWidth[i] = arrWidth[i]+i;	
	}
	arrToString(arrWidth);
}
}
