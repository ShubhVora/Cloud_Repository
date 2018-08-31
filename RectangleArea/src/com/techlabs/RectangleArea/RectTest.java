package com.techlabs.RectangleArea;

public class RectTest {

	static int calculateArea() {
		return (Rectangle.getHeight()) * (Rectangle.getWidth());
	}

	public static void main(String Args[]) {
		Rectangle.setHeight();
		Rectangle.setWidth();
		System.out.println("Area Of Rectangle\t" + calculateArea());
	}

}
