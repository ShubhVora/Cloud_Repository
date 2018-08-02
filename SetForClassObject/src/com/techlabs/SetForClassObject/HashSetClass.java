package com.techlabs.SetForClassObject;

import java.util.HashSet;

public class HashSetClass {

	HashSet<Student> hs= new HashSet<Student>();
	
	public void add(Student stud)
	{
		hs.add(stud);
	}
	public boolean delete(Student stud)
	{
		return this.hs.remove(stud);
	}
	public boolean search(Student stud)
	{
		return hs.contains(stud);
	}
	public boolean update(String name, Student stud)
	{
		if(this.search(stud)){
			for(Student temp: this.hs)
			{
				if(temp.getId()==stud.getId() && temp.getName()==stud.getName())
				{
					temp.setName(name);
					return true;
				}
			}
				
		}
			return false;
		
	}
	public HashSet<Student> getHashSetList(){
		return this.hs;
	}
}
