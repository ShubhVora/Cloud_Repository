package com.techlabs.Contact_app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactShare {

	public void serialize(ArrayList<Contact> ContactList) throws Exception {

		FileOutputStream student = new FileOutputStream("Contact.ser");
		ObjectOutputStream out = new ObjectOutputStream(student);

		out.writeObject(ContactList);

		out.close();
	}

	public ArrayList<Contact> deserialize() {

		ArrayList<Contact> contactList = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Contact.ser"));
			contactList = (ArrayList<Contact>)in.readObject();
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		return contactList;
	}

	public void export(ArrayList<Contact> arrayObject) throws Exception {
		FileWriter cont = new FileWriter("Contact.csv");

		for (int i = 0; i < arrayObject.size(); i++) {
			cont.append(arrayObject.get(i).getfname());
			cont.append(",");

			cont.append(arrayObject.get(i).getlname());
			cont.append(",");

			cont.append(arrayObject.get(i).getemail());
			cont.append(",");
		}

		cont.close();

	}

}
