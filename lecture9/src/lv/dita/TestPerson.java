package lv.dita;

import lv.dita.users.Teacher;

public class TestPerson {

	public static void main(String[] args) {

//		String[] courses = new String[];
//		
//		courses[0] = "Mathematics";
//		courses[1] = "Sport";
//		courses[2] = "Physics";
//		courses[3] = "Literature";

		Teacher teacher1 = new Teacher("Toms Rudzs", "Deglava iela 17");
		System.out.println(teacher1.toString());
//		teacher1.addCourse("Mathematics");
//		teacher1.addCourse("Sport");
		String[] courses = {"Literature", "Mathematics", "Sport", "Physics"};
		for(String course : courses){
			System.out.println();
		}
		
	}

}
