package com.techlabs.RTO;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class Database {
	public void write(ArrayList<RTO> list) {
		try {
			FileReader file = new FileReader("db.properties");
			Properties p = new Properties();
			for (int i = 0; i < list.size(); i++) {
				p.setProperty(list.get(i).getCode(), list.get(i).getState());
			}
			file.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<RTO> readList() {

		ArrayList<RTO> RTOList = new ArrayList<RTO>();
		try {
			FileReader file = new FileReader("db.properties");
			Properties p = new Properties();
			p.load(file);
			Set<String> code = p.stringPropertyNames();
			for (String temp : code) {
				RTOList.add(new RTO(temp, p.getProperty(temp)));
			}
			file.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return RTOList;
	}

}
