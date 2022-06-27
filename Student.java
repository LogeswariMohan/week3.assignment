package week3.assignment.org.student;

import week3.assignment.org.department.Department;

public class Student extends Department {

	public String studentName() {
		String name = "Logeswari";
		return name;
	}
	public String studentDept() {
		String studentDept = "EIE";
		return studentDept; 
	}
	public int studentId() {
		int id = 12345;
		return id;
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("College name = " +s.collegeName());
		System.out.println("Code = "+s.collegeCode());
		System.out.println("Rank = "+s.collegeRank());
		System.out.println("Dept = "+s.deptName());
		System.out.println("Student Name = "+s.studentName());
		System.out.println("Student Department = "+s.studentDept());
		System.out.println("Id = "+s.studentId());

	}

}
