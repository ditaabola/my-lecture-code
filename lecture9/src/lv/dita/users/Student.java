package lv.dita.users;

public class Student extends Person {
	int numCourses;
	String[] courses;
	int[] grades;
	private static final int MAX_COURSES = 12;

	public Student(String name, String address) { // ja maates klasee nav defaultaa konstruktora, nevar atstat brivu
		super(name, address);
		this.numCourses = 0;
		++numCourses;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
		}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		}
	public void printGrades(){
		
		}

	public double getAverageGrade(){
		
		return 0.0;
		}
	
	public String toString(){
		return "Student: " + super.toString();
	}	
}

