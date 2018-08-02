package com.techlabs.comparator;

import java.util.Comparator;

public class JobCandidate1 implements Comparator {

    private String name;
	private int salary,id,age;

	JobCandidate1(String name, int salary, int id, int age) {
		this.name = name;
		this.salary=salary;
		this.id=id;
		this.age=age;
	}
	

	
	public String getName()
	{
		return this.name;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public int getId()
	{
		return this.id;
	}
	public int getAge()
	{
		return this.age;
	}


	
}
