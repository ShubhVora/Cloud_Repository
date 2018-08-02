package com.techlabs.SetForClassObject;

import java.util.*;

public class TreeSetClass {

		TreeSet<Student> treeset = new TreeSet<Student>();

		public void add(Student stud)
		{
			treeset.add(stud);
		}
		public boolean delete(Student stud)
		{
			return this.treeset.remove(stud);
		}
		public boolean search(Student stud)
		{
			return treeset.contains(stud);
		}
		public boolean update(String name, Student stud)
		{
			if(this.search(stud)){
				for(Student temp: this.treeset)
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
		public TreeSet<Student> getTreeSet(){
			return this.treeset;
		}
		
	}



