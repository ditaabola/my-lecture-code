package lv.dita;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		String[] arr = new String[4];
		System.out.println(arr.length); // vienkarsais masivs, garuma metode
		arr[0] = "Element name";
		System.out.println(arr[0]);

	
		ArrayList<String> array = new ArrayList<>();
		System.out.println(array.size()); // dinamiska masiva liste, garuma metode
		array.add("Element name in Array list");
		array.add("Element next");
		array.add("And again next element");
		array.add("2");
		System.out.println(array);
		System.out.println(array.size());
		
		ArrayList<String> carName = new ArrayList<>();
		carName.add("Mazda");
		carName.add("Volvo");
		carName.add("BMW");
		carName.add("Golf");
		carName.add("Hyundai");
		carName.add("Skoda");
		
		for(String carNames : carName);
		System.out.println(carName);
		
	}

}
