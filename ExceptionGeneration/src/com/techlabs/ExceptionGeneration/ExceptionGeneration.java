package com.techlabs.ExceptionGeneration;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionGeneration {

	public static void end() {
		end();
	}

	public static void main(String args[]) {

		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int a[] = new int[2];
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			FileReader fr = new FileReader("abc.txt");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		try {
			int a = Integer.parseInt("null");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		try {

			end();
		} catch (StackOverflowError e) {
			System.out.println(e);
		}

	}

}
