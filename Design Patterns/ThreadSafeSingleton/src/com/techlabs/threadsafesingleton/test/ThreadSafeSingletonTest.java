package com.techlabs.threadsafesingleton.test;

import com.techlabs.threadsafesingleton.Student;

public class ThreadSafeSingletonTest {
	public static void main(String args[])
	{
		Student student= Student.getStudent();
		Student student1= Student.getStudent();
		
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		
		student.setName("Manoj");
		student.setRoll(27);
		student1.setName("Shubham");
		student.setRoll(70);
		
		System.out.println("Name:\t"+student.getName()+"\nRoll:\t"+student.getRoll());
		System.out.println("Name:\t"+student1.getName()+"\nRoll:\t"+student1.getRoll());
	}

}
