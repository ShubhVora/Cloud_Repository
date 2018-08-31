package com.techlabs.SerializeApp;

import java.io.Serializable;

public class Student implements Serializable {

	private String fname, email;
	private int roll;

	Student(String fname, int roll, String email) {
		this.fname = fname;
		this.roll = roll;
		this.email = email;
	}

	public String getName() {
		return this.fname;
	}

	public int getRoll() {
		return this.roll;
	}

	public String getEmail() {
		return this.email;
	}

}
