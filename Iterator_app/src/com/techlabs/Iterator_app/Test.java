package com.techlabs.Iterator_app;

import java.util.ArrayList;

public class Test {
	
	public static void main(String args[])
	{
		Student student1 = new Student(20, "Shubham");
		Student student2 = new Student(21, "Varshil");
		Student student3 = new Student(22, "Manoj");
		
		Student [] student = {student1,student2,student3};
		
        StudentCollect<Student> studentCollect = new StudentCollect<Student>(Student.NumberOfstudent, student);
		
		for(Student studentTemp: studentCollect) {
			System.out.println(studentTemp.getName()+"\t"+studentTemp.getROll());
		
			}

}
}
