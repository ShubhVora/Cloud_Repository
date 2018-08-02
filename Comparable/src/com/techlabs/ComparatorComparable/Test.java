package com.techlabs.ComparatorComparable;

import java.util.*;

public class Test{  
	public static void main(String args[]){
		
	JobCandidate j1= new JobCandidate("Shubham", 2800, 1, 25);  
	JobCandidate j2=  new JobCandidate("Varshil", 29000, 2, 26);
	JobCandidate j3=  new JobCandidate("Manoj", 30000, 3, 20);
	JobCandidate j4=  new JobCandidate("ABC", 29000, 2, 29);
	
	ArrayList<JobCandidate> listOfCandidate = new ArrayList<JobCandidate>();
	
	listOfCandidate.add(j1);
	listOfCandidate.add(j2);
	listOfCandidate.add(j3);
	listOfCandidate.add(j4);
	
	CandidateSort sort = new CandidateSort();
	
	sort.getSortedListOfCandidiate(listOfCandidate);
	
	for(int i=0;i<listOfCandidate.size();i++)
	{
		JobCandidate j5=(JobCandidate)listOfCandidate.get(i);
		System.out.println();
		System.out.print("\t"+j5.getName());
		System.out.print("\t"+j5.getSalary());
		System.out.print("\t"+j5.getId());
		System.out.print("\t"+j5.getAge());
	}
	} 
	

}
