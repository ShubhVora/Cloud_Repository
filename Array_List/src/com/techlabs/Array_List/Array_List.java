package com.techlabs.Array_List;

import java.util.ArrayList;

public class Array_List {
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(new Integer(4));
		al.add(new Integer(57));
		al.add(new Integer(39));
		
		al.remove(new Integer(39));
		
		System.out.println("Contents of Array are:"+ al);
		
	}
}
