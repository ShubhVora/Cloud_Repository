package com.tachlabs.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {

	public void write() {
		try {
			FileWriter fw = new FileWriter("FileProgram.txt");
			fw.write("hi");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void read() {
		try {

			FileReader fr = new FileReader("FileProgram.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}