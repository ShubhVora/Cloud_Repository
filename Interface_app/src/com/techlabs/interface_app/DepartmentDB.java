package com.techlabs.interface_app;

public class DepartmentDB implements Icrudable{

	public void create()
	{
		System.out.println("Created in DepartmentDB");
	}
	public void update()
	{
		System.out.println("Upadated in DepartmentDB");
	}
	public void read()
	{
		System.out.println("Read in DepartmentDB");
	}
	public void delete()
	{
		System.out.println("Deleted in DepartmentDB");
	}
}
