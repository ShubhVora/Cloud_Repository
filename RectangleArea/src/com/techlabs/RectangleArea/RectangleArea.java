package com.techlabs.RectangleArea;

import java.util.Scanner;

public class RectangleArea {

	static int calculateArea(int height, int width) {
		return height * width;
	}

	public static void main(String Args[]) {
		int Height, Width;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Height of Rectangle:\t");
		Height = sc.nextInt();
		System.out.println("Enter width of Rectangle:\t");
		Width = sc.nextInt();
		System.out.println("Area Of Rectangle\t" + calculateArea(Height, Width));
	}

}
