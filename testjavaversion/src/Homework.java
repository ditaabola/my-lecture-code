import java.util.ArrayList;
import java.util.Collection;

public class Homework {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		list1.add(11);
		list1.add(15);
		list1.add(17);
		list1.add(28);
		list1.add(41);
		list1.add(59);

		list2.add(4);
		list2.add(7);
		list2.add(11);
		list2.add(17);
		list2.add(19);
		list2.add(21);
		list2.add(23);
		list2.add(28);
		list2.add(37);
		list2.add(59);
		list2.add(81);

		System.out.println(list1);
		System.out.println(list2);
		intersect(list1, list2);
	}

	public static void intersect(ArrayList list1, ArrayList list2) {
		ArrayList<Integer> list3 = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					list3.add((Integer) list1.get(i)); //casting, ko piedaavaaja Eclipse, bez taa nestraadaaja
				}
			}
		}
		System.out.println("Common elements: " + list3);

	}
}
