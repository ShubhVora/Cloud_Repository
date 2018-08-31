package com.techlabs.ComparatorComparable;

public class JobCandidate implements Comparable {
	private String name;
	private int salary, id, age;

	JobCandidate(String name, int salary, int id, int age) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.age = age;
	}

	@Override
	public int compareTo(Object obj1) {

		JobCandidate obj2 = (JobCandidate) obj1;
		if (this.age > obj2.age) {
			return 1;
		} else if (this.age < obj2.age) {
			return -1;
		} else
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
