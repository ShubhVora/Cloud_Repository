package com.techlabs.College_app;

public class Professor extends Person {

	private int salary, NumberOfHour;

	Professor(int id, String address, int dob, int hr) {
		super(id, address, dob);
		this.salary = 100;
		this.NumberOfHour = hr;
	}

	public int getSalary() {
		return this.salary;
	}

	public int getHour() {
		return this.NumberOfHour;
	}

	public void setSalary(int num) {
		this.salary = num;
	}

}
