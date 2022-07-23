package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name:Sara");
	}
	
	public void studentDepartment() {
		System.out.println("Student Dept:CSE");
	}
	
	public void studentID() {
		System.out.println("Student ID:071CS112");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDepartment();
		stud.studentID();
			
	}
}
