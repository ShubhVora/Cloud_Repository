package com.techlabs.SerializeApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Database {

	void serialize(Student s1) throws Exception {

		FileOutputStream student = new FileOutputStream("Student.ser");
		ObjectOutputStream out = new ObjectOutputStream(student);
		out.writeObject(s1);
		out.close();

	}

	Student deserialize() throws Exception {
		Student s = null;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.ser"));
		s = (Student) in.readObject();
		in.close();

		return s;
	}

}
