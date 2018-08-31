package com.techlabs.Contact_app;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactTest {

	public static void main(String args[]) throws Exception {

		final int DISPLAY = 1, ADD = 2, EXPORT = 3, EXIT = 4;
		ArrayList<Contact> ContactList = new ArrayList<Contact>();
		ContactShare shareContact = new ContactShare();

		// ContactList.add(new Contact("Shubham", "Vora",
		// "shubhamvora@gmail.com"));
		// shareContact.serialize(ContactList);
		int choice;

		ContactList = shareContact.deserialize();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("MENU:   (" + ContactList.size() + ")\n1. Display\n2. Add\n3. Export\n4. Exit:");
			choice = sc.nextInt();

			switch (choice) {
			case DISPLAY:
				display(ContactList);
				break;
			case ADD:
				System.out.println("Enter the details of Contact:");
				System.out.println("Enter First Nme:");
				String fname = sc.next();
				System.out.println("Enter Last Name:");
				String lname = sc.next();
				System.out.println("Enter email:");
				String email = sc.next();
				Contact contact = new Contact(fname, lname, email);
				ContactList.add(contact);
				break;
			case EXPORT:
				shareContact.export(ContactList);
				break;
			case EXIT:
				shareContact.serialize(ContactList);
				break;
			}

		} while (choice != 4);

		sc.close();

	}

	static void display(ArrayList<Contact> arrayObject) {
		for (int i = 0; i < arrayObject.size(); i++) {
			System.out.print("First name:" + arrayObject.get(i).getfname());
			System.out.print("\tLast name:" + arrayObject.get(i).getlname());
			System.out.print("\tEmail:" + arrayObject.get(i).getemail());
			System.out.println();
		}
	}

}
