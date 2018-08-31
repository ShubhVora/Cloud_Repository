package com.techlabs.College_app;

import java.util.ArrayList;

public class TestMain {

	public static void main(String args[]) {
		ArrayList<Professor> profList = new ArrayList<Professor>();
		ArrayList<Professor> profList2 = new ArrayList<Professor>();
		College c = new College();
		Student student = new Student(1, "ASGHD", 12, Branch.Comp);
		Professor professor = new Professor(1, "bhjb", 15, 2);
		c.addStudent(student);
		c.addProfessor(professor);
		profList2 = profList = c.getProfessorList();
		profList2 = c.calculateSalary(profList);

		System.out.println("Student\n" + "ID\tAddress\tDOB\tBranch");
		System.out.println("----\t----\t----\t-----");
		for (Student temp : c.getStudentList())
			System.out
					.println(temp.getId() + "\t" + temp.getAddress() + "\t" + temp.getDOB() + "\t" + temp.getBranch());

		System.out.println("\nProfessor\n" + "ID\tAddress\tDOB\tSalary\tHour");
		System.out.println("----\t----\t----\t-----\t----");
		for (Professor temp : c.getProfessorList())
			System.out.println(temp.getId() + "\t" + temp.getAddress() + "\t" + temp.getDOB() + "\t" + temp.getSalary()
					+ "\t" + temp.getHour());
	}
}
