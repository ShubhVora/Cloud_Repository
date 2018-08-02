package com.techlabs.Iterator_app;

public class Student{
	static int NumberOfstudent=0;
	private int roll;
	private String name;
	
	Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
		NumberOfstudent++;
	}
	public int getROll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}

	
}
