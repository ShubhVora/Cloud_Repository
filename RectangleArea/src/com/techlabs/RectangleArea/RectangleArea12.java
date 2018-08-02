package com.techlabs.RectangleArea;

import java.util.*;


class RectangleTest
{
	static Scanner sc = new Scanner(System.in);
	 private static int Height,Width;
	static void setHeight()
	{
		System.out.println("Enter Height Of an Rectangle");
		Height=sc.nextInt();
	}
	static void setWidth()
	{
		System.out.println("Enter Height Of an Rectangle");
		Width=sc.nextInt();
	}
	static int getWidth()
	{

		return Width;
	}

	static int getHeight()
	{

		return Height;
	}
}

public class RectangleArea12 {
	
	static int calculateArea()
	{
		return (RectangleTest.getHeight())*(RectangleTest.getWidth());
	}
	
	public static void main(String Args[])
	{
		RectangleTest.setHeight();
		RectangleTest.setWidth();
		System.out.println("Area Of Rectangle\t"+calculateArea());
	}

}
