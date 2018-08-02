package com.techlabs.College_app;

public class Person extends College {

	private int id, dob;
	private String address;

	Person(int id, String address, int dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return this.id;
	}

	public String getAddress() {
		return this.address;
	}

	public int getDOB() {
		return this.dob;
	}

}
