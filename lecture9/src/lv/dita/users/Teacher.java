package lv.dita.users;

import java.util.Arrays;

public class Teacher extends Person {
	int numCourses;
	String[] courses;
	private static final int MAX_COURSES = 4;

	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
	}

		public String toString() {
		return "Teacher: " + super.toString();
	}

		public void addCourse(String course) {
			courses[numCourses] = course;
			++numCourses;
//			System.out.println(Arrays.toString(course));
		}
		
		public boolean addCoursesCheck(String course) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		++numCourses;
		return true;
	}

		public boolean removeCourses(String course){
			boolean found = false;
			int courseIndex = -1;
			for(int i = 0; i<numCourses; i++){
				if(courses[i].equals(course)){
					courseIndex = i;
					found = true;
					break;
				}
			}
		if(found){
			for(int i=courseIndex; i<numCourses-1; i++){
				courses[i] = courses[i+1];
				}
			numCourses--;
			return true;
		}else{
			return false;
		}
		}
		
}
