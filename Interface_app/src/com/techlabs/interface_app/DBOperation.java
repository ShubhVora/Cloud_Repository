package com.techlabs.interface_app;

public class DBOperation {
	
	 static void dboperation(Icrudable object)
	{
		object.create();
		object.read();
		object.update();
		object.delete();
	}
	public static void main(String args[])
	{
	  dboperation(new CustomerDB());
	  dboperation(new InvoiceDB());
	  dboperation(new DepartmentDB());
	
	
	}

}
 