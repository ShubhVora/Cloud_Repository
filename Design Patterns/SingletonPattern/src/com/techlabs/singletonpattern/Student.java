package com.techlabs.singletonpattern;

public class Student {

	private static Student student;

	private String name;
	private int roll;

	private Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public static Student getStudentInstance() {
		if (student == null) {
			student = new Student("Shubham", 70);
		}
		return student;
	}

}
