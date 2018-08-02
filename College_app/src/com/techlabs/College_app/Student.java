package com.techlabs.College_app;

public class Student extends Person {
	private Branch branch;
	Branch b;

	Student(int id, String address, int dob, Branch branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branch getBranch() {
		return this.branch;
	}

}
