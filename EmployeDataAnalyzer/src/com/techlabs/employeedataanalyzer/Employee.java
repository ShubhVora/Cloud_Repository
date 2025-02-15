package com.techlabs.employeedataanalyzer;

import java.util.ArrayList;

public class Employee {
	private int deptNo;
	private String id, designation, managerID, name, DOJ, Null;
	private float salary;
	private ArrayList<Employee> childEmployeeList = new ArrayList<Employee>();;

	Employee(String id, String name, String designation, String managerID, String DOJ, float salary, String Null,
			int deptNo) {
		this.id = id;
		this.managerID = managerID;
		this.deptNo = deptNo;
		this.designation = designation;
		this.name = name;
		this.DOJ = DOJ;
		this.Null = Null;
		this.salary = salary;
	}

	public String getId() {
		return this.id;
	}

	public String getManagerID() {
		return this.managerID;
	}

	public int getDeptNo() {
		return this.deptNo;
	}

	public String getDesignation() {
		return this.designation;
	}

	public String getName() {
		return this.name;
	}

	public String getDOJ() {
		return this.DOJ;
	}

	public float getSalary() {
		return this.salary;
	}

	public ArrayList<Employee> getChildEmployeeList() {
		return childEmployeeList;
	}

	public void setList(ArrayList<Employee> employeeList) {
		this.childEmployeeList = employeeList;
	}

	public void addChildEmployee(Employee employee) {
		this.childEmployeeList.add(employee);
	}

}
