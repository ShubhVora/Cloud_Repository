package com.techlabs.bankapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LoadFile {
	public ArrayList<Manager> read() throws Exception {
		ArrayList<Manager> listOfManager = new ArrayList<Manager>();

		FileInputStream file = new FileInputStream("EmployeeData.ser");
		ObjectInputStream out = new ObjectInputStream(file);
		listOfManager = (ArrayList<Manager>) out.readObject();
		out.close();
		file.close();
		return listOfManager;
	}

	public void write(ArrayList<Manager> list) throws Exception {

		FileOutputStream fr = new FileOutputStream("EmployeeData.ser");
		ObjectOutputStream out = new ObjectOutputStream(fr);
		out.writeObject(list);
		out.close();
		fr.close();
	}

}
