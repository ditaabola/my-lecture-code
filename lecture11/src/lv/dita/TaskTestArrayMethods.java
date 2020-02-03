package lv.dita;

import java.util.ArrayList;

public class TaskTestArrayMethods {

	public static void main(String[] args) {
		ArrayList<String> carName = new ArrayList<>();
		carName.add("Mazda");
		carName.add("Volvo");
		carName.add("BMW");
		carName.add("Golf");
		carName.add("Hyundai");
		carName.add("Skoda");
		
		for (String carNames : carName);
		System.out.println(carName);
		System.out.println("------------------");
		System.out.println(carName.size());
		
		carName.remove("Golf");
		for (String carNames : carName);
		System.out.println(carName);
		System.out.println(carName.size());
		System.out.println("Index name of BMW is " + carName.indexOf("BMW"));
		System.out.println(carName.isEmpty());
		System.out.println("Car in the index 2 is "+ carName.get(2));
		
		System.out.println(carName.set(0, "Ford")); // ar set metodi nevar padarit dinamiski lielaku, tam ir add;
		for (String carNames : carName);
		System.out.println(carName);
		
		carName.clear(); // iztuksho masiivu
		for (String carNames : carName);
		System.out.println(carName);
		
	}
	
}