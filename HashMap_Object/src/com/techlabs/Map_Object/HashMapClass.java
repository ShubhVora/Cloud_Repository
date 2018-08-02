package com.techlabs.Map_Object;

import java.util.HashMap;

public class HashMapClass {
	
	HashMap<Integer,Student> hashmap = new HashMap<Integer,Student>();
	public void add(int key, Student object)
	{
		hashmap.put(key, object);
	}
	public boolean delete(int key)
	{
		if(search(key) == true)
		{
		 hashmap.remove(key);
		 return true;
		}
		else
			return false;
	}
	public boolean update(int key, Student oldValue, Student newValue)
	{
		return hashmap.replace(key, oldValue, newValue);
	}
	public boolean search(int key)
	{
		 return hashmap.containsKey(key);
	}
	public HashMap<Integer, Student > getHashMapList()
	{
		return this.hashmap;
	}

}
