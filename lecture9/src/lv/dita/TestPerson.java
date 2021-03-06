package lv.dita;

import java.util.Arrays;

import lv.dita.users.Student;
import lv.dita.users.Teacher;

public class TestPerson {

	public static void main(String[] args) {

		Student student1 = new Student("Arnis Lugazs", "Baldone");
		student1.addCourseGrade("Math", 10);
		student1.addCourseGrade("Literature", 8);
		student1.printGrades();
		System.out.println();
		System.out.println("The average grade of " + student1.toString()
				+ " is " + student1.getAverageGrade());

		Student student2 = new Student("Ieva Liepa", "Ogre");
		student2.addCourseGrade("Literature", 10);
		student2.addCourseGrade("Sport", 5);
		student2.printGrades();
		System.out.println();
		System.out.println("The average grade of " + student2.toString()
				+ " is " + student2.getAverageGrade());

		Teacher teacher1 = new Teacher("Toms Rudzs", "Deglava iela 17");
		System.out.println(teacher1.toString());
		String[] courses = {"Math", "Literature", "Sport", "Math"};
		for(String coursess: courses){
			if(teacher1.addCoursesCheck(coursess)){
			System.out.println(coursess + " added");
			}else{
				System.out.println(coursess + " cannot be added");
			}	
		}
				for(String coursess: courses){
					if(teacher1.removeCourses(coursess)){
					System.out.println(coursess + " removed");
					}else{
						System.out.println(courses + " cannot be removed");
					
						
			
			}
		}
		
		
		
	}

}
