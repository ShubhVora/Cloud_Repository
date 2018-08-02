package com.techlabs.circle;

import java.util.*;
public class CircleTest {
	static void printDetails(Circle circle)
	{
		System.out.print("Area of Circle:\t"+circle.calculatedArea());
		System.out.print("\nStyle of Circle:\t"+circle.getBorderSytle());
		
		
	}
	public static void main(String Args[])
	{
		Circle circle = new Circle();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the Radius of circle:\t");
		circle.setRadius(sc.nextFloat());
        circle.setBorderSytle(BorderStyle.DOTTED);
        printDetails(circle);
		sc.close();
	}

}
