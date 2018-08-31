package com.techlabs.singletonpattern.test;

import com.techlabs.singletonpattern.Student;

public class StudentTest {
	public static void main(String args[]) {
		Student student1 = Student.getStudentInstance();
		Student student2 = Student.getStudentInstance();

		System.out.println(student1.hashCode());

		System.out.println(student2.hashCode());
	}

}
