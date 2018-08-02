package com.techlabs.Contact_app;

import java.io.Serializable;

public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname,lname,email;
	
	Contact(String fname, String lname, String email)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
	}
	
	public String getfname()
	{
		return fname;
	}

	public String getlname()
	{
		return lname;
	}
	public String getemail()
	{
		return email;
	}
}
