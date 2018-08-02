package com.techlabs.Map_Object;

import java.util.TreeMap;

public class TreeMapClass {

	TreeMap<Integer,Student> Treemap = new TreeMap<Integer,Student>();
	public void add(int key, Student object)
	{
		Treemap.put(key, object);
	}
	public boolean delete(int key)
	{
		if(search(key) == true)
		{
		 Treemap.remove(key);
		 return true;
		}
		else
			return false;
	}
	public boolean update(int key, Student oldValue, Student newValue)
	{
		return Treemap.replace(key, oldValue, newValue);
	}
	public boolean search(int key)
	{
		 return Treemap.containsKey(key);
	}
	public TreeMap<Integer, Student > getTreeMapList()
	{
		return this.Treemap;
	}

}
