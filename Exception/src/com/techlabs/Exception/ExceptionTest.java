package com.techlabs.Exception;

import java.util.ArrayList;

public class ExceptionTest {

	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("Shubham", 58));
		list.add(new Student("Varshil", 59));
		list.add(new Student("Manoj", 60));

		try {
			search(list, 62);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static boolean search(ArrayList<Student> list, int num) throws ExceptionExample {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRoll() == num) {
				System.out.println("Object is present");
				return true;
			}
		}

		throw new ExceptionExample("Object not present");

	}
}
