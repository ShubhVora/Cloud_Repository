package com.techlabs.TestOverloading;

public class TestOverloading {
	public static void main(String args[])
	{
		print(10);
		print(10.0f);
		print("Shubham");
		print(10.0);
		
	}
	
	static void print(int num)
	{
		System.out.println("Integer:\t"+num);
	}
	static void print(float num)
	{
		System.out.println("Float:\t"+num);
	}
	static void print(String name)
	{
		System.out.println("String:\t"+name);
	}
	static void print(Double num)
	{
		System.out.println("Double:\t"+num);
	}

}
