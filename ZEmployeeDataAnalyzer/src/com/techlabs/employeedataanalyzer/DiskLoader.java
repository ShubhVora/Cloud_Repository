package com.techlabs.employeedataanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DiskLoader implements ILoader {

	public ArrayList<String> load() {

		ArrayList<String> list = new ArrayList<String>();
		try {

			BufferedReader fr = new BufferedReader(new FileReader("EmployeeData.csv"));
			String line;
			while ((line = fr.readLine()) != null) {
				list.add(line);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}