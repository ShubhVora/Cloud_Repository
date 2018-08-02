package com.techlabs.EmployeeReflection;

public class Employee {
	
	private String name,department;
	private int salary;
	
	Employee(String name, String department, int salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	
	
	public int getSalary()
	{
		return this.salary;
	}
	public String getName()
	{
		return this.name;
	}public String getDepartment()
	{
		return this.department;
	}

}
