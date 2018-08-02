package com.techlabs.Map_Integer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	
	public static void main(String args []){
		HashMapClass hmp = new HashMapClass();
		LinkedHashMapClass lhmp = new LinkedHashMapClass();
		TreeMapClass tmp = new TreeMapClass();
		
		Case1(hmp);
		case2(lhmp);
		case3(tmp);
		
	}

	private static void case3(TreeMapClass tmp) {
		tmp.add(1, "ABC");
		tmp.add(2, "PQR");
		tmp.add(3, "XYZ");
		tmp.add(4, "ASD");
		
		TreeMap<Integer, String> TreeMap= new TreeMap<Integer, String>();
		TreeMap= tmp.getTreeMap();
		System.out.println("\n\nLinkedHashMap elements are");
		
		for(Map.Entry<Integer,String> m :TreeMap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		
		System.out.println("Deleted key value 3:\t"+tmp.delete(3, "XYZ"));
		System.out.println("Searched key value 4:\t"+tmp.search(4));
		System.out.println("Updated key 2:\t"+tmp.update(2, "PQR", "STR"));
	}

	private static void case2(LinkedHashMapClass lhmp) {
		lhmp.add(1, "ABC");
		lhmp.add(2, "PQR");
		lhmp.add(3, "XYZ");
		lhmp.add(4, "ASD");
		
		LinkedHashMap<Integer, String> hashMap= new LinkedHashMap<Integer, String>();
		hashMap= lhmp.getLinkedHashMap();
		System.out.println("\n\nLinkedHashMap elements are");
		
		for(Map.Entry<Integer,String> m :hashMap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		
		System.out.println("Deleted key value 3:\t"+lhmp.delete(3, "XYZ"));
		System.out.println("Searched key value 4:\t"+lhmp.search(4));
		System.out.println("Updated key 2:\t"+lhmp.update(2, "PQR", "STR"));
	}

	private static void Case1(HashMapClass hmp) {
		hmp.add(1, "ABC");
		hmp.add(2, "PQR");
		hmp.add(3, "XYZ");
		hmp.add(4, "ASD");
		
		HashMap<Integer, String> linkedhashMap= new HashMap<Integer, String>();
		linkedhashMap= hmp.getHashMap();
		System.out.println("HashMap elements are");
		
		for(Map.Entry<Integer,String> m :linkedhashMap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		
		System.out.println("Deleted key value 3:\t"+hmp.delete(3, "XYZ"));
		System.out.println("Searched key value 4:\t"+hmp.search(4));
		System.out.println("Updated key 2:\t"+hmp.update(2, "PQR", "STR"));
	}
}
