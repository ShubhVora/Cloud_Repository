package com.techlabs.interface_app;

public class InvoiceDB implements Icrudable {

	public void create()
	{
		System.out.println("Created in InvoiceDB");
	}
	public void update()
	{
		System.out.println("Upadated in InvoiceDB");
	}
	public void read()
	{
		System.out.println("Read in InvoiceDB");
	}
	public void delete()
	{
		System.out.println("Deleted in InvoiceDB");
	}
}
