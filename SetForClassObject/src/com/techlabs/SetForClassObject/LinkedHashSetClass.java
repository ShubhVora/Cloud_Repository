package com.techlabs.SetForClassObject;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	LinkedHashSet<Student> linkedhashset= new LinkedHashSet<Student>();

	public void add(Student stud) {
		linkedhashset.add(stud);
	}

	public boolean delete(Student stud) {
		return this.linkedhashset.remove(stud);
	}

	public boolean search(Student stud) {
		return linkedhashset.contains(stud);
	}

	public boolean update(String name, Student stud) {
		if (this.search(stud)) {
			for (Student temp : this.linkedhashset) {
				if (temp.getId() == stud.getId() && temp.getName() == stud.getName()) {
					temp.setName(name);
					return true;
				}
			}

		}
		return false;

	}

	public LinkedHashSet<Student> getHashSetList() {
		return this.linkedhashset;
	}
}
