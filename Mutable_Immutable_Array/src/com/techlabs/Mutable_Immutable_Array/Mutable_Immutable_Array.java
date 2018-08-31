package com.techlabs.Mutable_Immutable_Array;

public class Mutable_Immutable_Array {
	static void marks(int marks[]) {
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;
	}

	public static void main(String args[]) {
		int marks[] = { 10, 20, 30, 40, 50 };
		marks(marks);

		for (int i = 0; i < marks.length; i++)
			System.out.println(marks[i]);

	}

}
