package lv.dita.users;

public class Student extends Person {
	int numCourses;
	String[] courses;
	int[] grades;
	private static final int MAX_COURSES = 12;

	public Student(String name, String address) { /*ja maates klasee nav
													 defaultaa konstruktora,
													nevar atstat brivu*/ 
		super(name, address);
		this.numCourses = 0;
		// ++numCourses; // lika klaat null-0 pirmajam "course" izmantojot metodi printGrades, tapec aizkomenteeju, bet pieliku pie addCourseGrade
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrades() {
		System.out.print(this); // reference to the current object
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" " + courses[i] + " - " + grades[i] + "; ");
		}
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i]; // katrreiz pieskaitiia klaat summai naakamo skaitli
		}
		return (double) sum / numCourses; // casting int to double
	}

	public String toString() {
		return "Student: " + super.toString();
	}

}