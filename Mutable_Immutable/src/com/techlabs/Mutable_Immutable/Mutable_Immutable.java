package com.techlabs.Mutable_Immutable;

public class Mutable_Immutable {
	
	static void marks(Integer marks)
	{
		 marks= 100;
	}
	public static void main(String args[])
	{
		int marks=10;
		Integer mark=marks;
		marks(mark);
		marks=mark.intValue();
		
		System.out.println(marks);
		
	}

}
