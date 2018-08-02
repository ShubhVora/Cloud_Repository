package com.techlabs.RectangleTest1;

import java.util.*;

public class RectangleTest1 {

	public static void main(String Args[]) {
		int height, width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height Of an Rectangle");
		height = sc.nextInt();
		System.out.println("Enter Width Of an Rectangle");
		width = sc.nextInt();
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		rectangle.setColor("Green");
		System.out.println("Area of Rectangle:\t"+ rectangle.CalculateArea());
		System.out.println("Border Color of Rectangle:\t"+ rectangle.checkColor());
		
		sc.close();
		
		
	}

}
