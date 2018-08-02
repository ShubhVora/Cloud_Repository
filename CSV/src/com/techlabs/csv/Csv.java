package com.techlabs.csv;

public class Csv {
	private String fname, email;
	private int roll;
	
	Csv(String fname, int roll, String email)
	{
		this.fname = fname;
		this.roll=roll;
		this.email=email;
	}
	
	public String getName()
	{
		return this.fname;
	}
	
	public int getRoll()
	{
		return this.roll;
	}
	public String getEmail()
	{
		return this.email;
	}

}
