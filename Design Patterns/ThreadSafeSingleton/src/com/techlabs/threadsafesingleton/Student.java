package com.techlabs.threadsafesingleton;

public class Student {

	private String name;
	private int roll;
	private static Student student;

	private Student() {
	}

	public static Student getStudent() {
		synchronized (Student.class) {
			if (student == null) {
				student = new Student();
			}
		}
		return student;
	}

	public String getName() {
		return this.name;
	}

	public int getRoll() {
		return this.roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

}
