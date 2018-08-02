package com.techlabs.Iterator_Iterable;

import java.util.Iterator;

public class CollectionOfNames implements Iterator {

	public String name[] = { "ABC", "DEF", "PQR", "XYZ", "RST" };
	int i;


	@Override
	public boolean hasNext() {
		if (i < name.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return name[i++];
		}
		return null;
	}

}