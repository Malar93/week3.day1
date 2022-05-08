package week3.day3.org.student;

import week3.day3.org.department.Department;

public class Student extends Department {
	public void StudentName()
	{
		System.out.println("Student Name: Malarvizhi");
	}
	public void StudendDep()
	{
		System.out.println("Student Dept: Compueter Science");
	}
	public void studendID()
	{
		System.out.println("Student ID: 213232");
	}

	public static void main(String[] args) {
		Student colg = new Student();
		colg.collegeName();
		colg.collegeCode();
		colg.collegeRank();
		colg.deptName();
		colg.StudentName();
		colg.StudendDep();
		colg.studendID();
	}
}
