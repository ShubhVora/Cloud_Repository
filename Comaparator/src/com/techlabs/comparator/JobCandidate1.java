package com.techlabs.comparator;

import java.util.Comparator;

public class JobCandidate1 implements Comparator<JobCandidate1> {

	private String name;
	private int salary, id, age;

	JobCandidate1() {

	}

	JobCandidate1(String name, int salary, int id, int age) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.age = age;
	}

	@Override
	public int compare(JobCandidate1 candidate1, JobCandidate1 candidate2) {
		if (candidate1.getAge() < candidate2.getAge())
			return -1;
		else if (candidate1.getAge() > candidate2.getAge())
			return 1;
		else
			return 0;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	public int getId() {
		return this.id;
	}

	public int getAge() {
		return this.age;
	}

}
