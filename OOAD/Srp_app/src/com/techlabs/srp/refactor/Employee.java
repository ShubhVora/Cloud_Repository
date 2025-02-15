package com.techlabs.srp.refactor;

public class Employee {
	private String name;
	private int id;
	private String department;

	public Employee(String name, int id, String department) {
		this.name = name;
		this.department = department;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
