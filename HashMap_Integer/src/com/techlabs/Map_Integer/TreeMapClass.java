package com.techlabs.Map_Integer;
import java.util.TreeMap;

public class TreeMapClass {
 	TreeMap<Integer, String> treemap= new TreeMap<Integer, String>();
	public void add(int key, String value)
	{
		treemap.put(key, value);
	}
	public boolean search(int key)
	{
	    return	treemap.containsKey(key);	
	}
	public boolean update(int key, String oldValue, String newValue)
	{
	 return  treemap.replace(key, oldValue, newValue);	
	}
	public boolean delete(int key,String value)
	{
		return treemap.remove(key, value);
	}
	public TreeMap<Integer,String> getTreeMap()
	{
		return this.treemap;
	}

}
