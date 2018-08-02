package com.techlabs.Map_Integer;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	
	LinkedHashMap<Integer, String> LinkedHashMap= new LinkedHashMap<Integer, String>();
	public void add(int key, String value)
	{
		LinkedHashMap.put(key, value);
	}
	public boolean search(int key)
	{
	    return	LinkedHashMap.containsKey(key);	
	}
	public boolean update(int key, String oldValue, String newValue)
	{
	 return  LinkedHashMap.replace(key, oldValue, newValue);	
	}
	public boolean delete(int key,String value)
	{
		return LinkedHashMap.remove(key, value);
	}
	public LinkedHashMap<Integer,String> getLinkedHashMap()
	{
		return this.LinkedHashMap;
	}

}
