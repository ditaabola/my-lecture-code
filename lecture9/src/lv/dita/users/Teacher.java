package lv.dita.users;

import java.util.Arrays;

public class Teacher extends Person {
	int numCourse;
	String course[];
	private static final int MAX_COURSES = 4;

	public Teacher(String name, String address) {
		super(name, address);
		this.numCourse = 0;
		this.course = new String[MAX_COURSES];
	}

	public void addCourse(String course) {
		this.numCourse = 0;
		++numCourse;
		//System.out.println(Arrays.toString(this.course));
	}

	public boolean addCourses(String course) {
		return true;
		}
	public boolean removeCourses(String course) {
		return true;
	}

	public String toString(){
		return "Teacher: " + super.toString();
	}
	

}