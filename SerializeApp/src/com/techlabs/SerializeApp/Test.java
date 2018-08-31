package com.techlabs.SerializeApp;

public class Test {

	public static void main(String args[]) throws Exception {

		Test testobject = new Test();
		Database db1 = new Database();
		Student s1 = new Student("Shubham", 69, "shubham69@gmail.com");
		db1.serialize(s1);

		testobject.display(db1.deserialize());

	}

	void display(Student s1) {
		System.out.println("Name:\t" + s1.getName() + "\nRoll number:\t" + s1.getRoll() + "\nEmail:\t" + s1.getEmail());
	}

}
