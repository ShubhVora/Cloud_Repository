package com.techlabs.SetForInteger;

import java.util.TreeSet;

public class TreesetClass {

	private TreeSet<Integer> set = new TreeSet<Integer>();
	public void addInteger(int num) {
		set.add(num);
	}

	public boolean deleteInteger(int number) {
		return set.remove(number);
	}

	public boolean searchInteger(int number) {
		return set.contains(number);
	}

	public boolean updateInteger(int number1,int number2)
	{
		if(searchInteger(number1)){
		   set.remove(number1);
		   set.add(number2);
			return true;
		}
			return false;
		
	}

	public TreeSet<Integer> getTreeSet() {
		return this.set;

	}

}
