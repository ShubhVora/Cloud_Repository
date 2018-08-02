package com.techlabs.SetForClassObject;

public class Student implements Comparable<Student> {
	private String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	@Override
	public int compareTo(Student student) {
		if (this.id == student.getId()) {
			return 0;
		} else if (this.id < student.getId()) {
			return -1;
		} else
			return 1;
	}

}
