package lv.dita;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayWithObjects {

	public static void main(String[] args) {
		Integer intObj = 40; // saucas Wrapper klase, kas jaaizmanto, lai masiivaa saglabaatu integerus
		Double doubleObj = 40.5;
		System.out.println(intObj.toString());
		ArrayList<Integer> intArrays = new ArrayList<>();
		intArrays.add(40);
		intArrays.add(20);
		intArrays.add(13);
		intArrays.add(60);
		System.out.println(intArrays);
		Collections.sort(intArrays);
		System.out.println(intArrays);

	}

}
