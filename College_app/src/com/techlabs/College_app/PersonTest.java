package com.techlabs.College_app;

public class PersonTest {

	public static void main(String args[]) {
		Person p = new Person(100, "address", 11);

		System.out.println(p.getId());
		System.out.println(p.getAddress());
		System.out.println(p.getDOB());
	}
}
