package com.techlabs.csv;

import java.io.FileWriter;

public class CsvTest {

	public static void main(String args[]) throws Exception
	{
		Csv obj1 = new Csv("Shubham", 23, "asda2@gmail.com");
		Csv obj2 = new Csv("Shubham", 23, "asda2@gmail.com");
		
		FileWriter file = new FileWriter("Detail.csv");
		
		file.append(obj1.getName());
		file.append(",");
		file.append(String.valueOf(obj1.getRoll()));
		file.append(",");
		file.append(obj1.getEmail());
		file.append("\n");
		file.append(obj2.getName());
		file.append(",");
		file.append(String.valueOf(obj2.getRoll()));
		file.append(",");
		file.append(obj2.getEmail());
		
		file.close();
		
		
	}
}
