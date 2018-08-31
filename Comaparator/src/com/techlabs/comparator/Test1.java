package com.techlabs.comparator;

import java.util.ArrayList;

public class Test1 {

	public static void main(String args[]) {

		JobCandidate1 j1 = new JobCandidate1("Shubham", 2800, 1, 25);
		JobCandidate1 j2 = new JobCandidate1("Varshil", 29000, 2, 26);
		JobCandidate1 j3 = new JobCandidate1("Manoj", 30000, 3, 20);
		JobCandidate1 j4 = new JobCandidate1("ABC", 29000, 2, 29);

		ArrayList<JobCandidate1> listOfCandidate = new ArrayList<JobCandidate1>();

		listOfCandidate.add(j1);
		listOfCandidate.add(j2);
		listOfCandidate.add(j3);
		listOfCandidate.add(j4);

		CandidateSort1 sort = new CandidateSort1();

		sort.getSortedListOfCandidiate(listOfCandidate);

		for (int i = 0; i < listOfCandidate.size(); i++) {
			JobCandidate1 j5 = listOfCandidate.get(i);
			System.out.println("String name\t" + j5.getName());
			System.out.println("Salary\t" + j5.getSalary());
			System.out.println("Id\t" + j5.getId());
			System.out.println("Age\t" + j5.getAge());
			System.out.println();
		}
	}

}
