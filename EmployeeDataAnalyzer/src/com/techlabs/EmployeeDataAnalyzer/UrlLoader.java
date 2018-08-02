package com.techlabs.EmployeeDataAnalyzer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class UrlLoader implements ILoader {

	public ArrayList<String> load() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			URLConnection urlConnection = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				list.add(line);
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}
}
