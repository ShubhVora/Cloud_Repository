package com.techlabs.Map_Integer;

import java.util.HashMap;

public class HashMapClass {

	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	public void add(int key, String value) {
		hashMap.put(key, value);
	}

	public boolean search(int key) {
		return hashMap.containsKey(key);
	}

	public boolean update(int key, String oldValue, String newValue) {
		return hashMap.replace(key, oldValue, newValue);
	}

	public boolean delete(int key, String value) {
		return hashMap.remove(key, value);
	}

	public HashMap<Integer, String> getHashMap() {
		return this.hashMap;
	}
}
