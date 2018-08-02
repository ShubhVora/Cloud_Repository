package com.techlabs.Map_Object;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	LinkedHashMap<Integer,Student> Linkedhashmap = new LinkedHashMap<Integer,Student>();
	public void add(int key, Student object)
	{
		Linkedhashmap.put(key, object);
	}
	public boolean delete(int key)
	{
		if(search(key) == true)
		{
		 Linkedhashmap.remove(key);
		 return true;
		}
		else
			return false;
	}
	public boolean update(int key, Student oldValue, Student newValue)
	{
		return Linkedhashmap.replace(key, oldValue, newValue);
	}
	public boolean search(int key)
	{
		 return Linkedhashmap.containsKey(key);
	}
	public LinkedHashMap<Integer, Student > getLinkedHashMapList()
	{
		return this.Linkedhashmap;
	}


}
