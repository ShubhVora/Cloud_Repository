package com.techlabs.RectangleArea;

import java.util.Scanner;

class Rectangle {
	static Scanner sc = new Scanner(System.in);
	private static int Height, Width;

	static void setHeight() {
		System.out.println("Enter Height Of an Rectangle");
		Height = sc.nextInt();
	}

	static void setWidth() {
		System.out.println("Enter Width Of an Rectangle");
		Width = sc.nextInt();
	}

	static int getWidth() {

		return Width;
	}

	static int getHeight() {

		return Height;
	}
}
