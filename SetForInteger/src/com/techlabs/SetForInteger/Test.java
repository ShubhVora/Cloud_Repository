package com.techlabs.SetForInteger;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) {

		HashsetClass hsc = new HashsetClass();
		hsc.addInteger(3);
		hsc.addInteger(78);
		hsc.addInteger(40);
		hsc.addInteger(56);
		
		System.out.println("List of Integers in HashSet\t" + hsc.getHashSetList());
		
		System.out.println("Search number 56 is present?" + hsc.searchInteger(56));
		
		System.out.println("Delete number 40\t"+hsc.deleteInteger(40));
		
		System.out.println("List of Integers in HashSet\t" + hsc.updateInteger(78, 27));

		System.out.println("List of Integers in HashSet after performing operations\t" + hsc.getHashSetList());
		
		
	    LinkedhashsetClass lhs = new LinkedhashsetClass();
		lhs.addInteger(45);
		lhs.addInteger(50);
		lhs.addInteger(55);
		lhs.addInteger(60);
		
		System.out.println("\n\nList of Integers in LinkedHashSet\t" + lhs.getLinkedHashSetList());
		
		System.out.println("Search number 56 is present?" + lhs.searchInteger(56));
		
		System.out.println("Delete number 50\t"+lhs.deleteInteger(50));
		
		System.out.println("List of Integers in LinkedHashSet\t" + lhs.updateInteger(70, 10));

		System.out.println("List of Integers in LinkedHashSet after performing operations\t" + lhs.getLinkedHashSetList());
		
		
		TreesetClass tsc = new TreesetClass();
		tsc.addInteger(75);
		tsc.addInteger(50);
		tsc.addInteger(35);
		tsc.addInteger(90);
		
		System.out.println("\n\nList of Integers in TreeSet\t" + tsc.getTreeSet());
		
		System.out.println("Search number 90 is present?" + tsc.searchInteger(90));
		
		System.out.println("Delete number 50\t"+tsc.deleteInteger(50));
		
		System.out.println("List of Integers in TreeSet\t" + tsc.updateInteger(75, 10));

		System.out.println("List of Integers in TreeSet after performing operations\t" + tsc.getTreeSet());
		
	
	
	}
}
