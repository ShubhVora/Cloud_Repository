package com.techlabs.interface_app;

public class CustomerDB implements Icrudable {

	public void create() {
		System.out.println("Created in CustomerDB");
	}

	public void update() {
		System.out.println("Upadated in CustomerDB");
	}

	public void read() {
		System.out.println("Read in CustomerDB");
	}

	public void delete() {
		System.out.println("Deleted in CustomerDB");
	}

}
