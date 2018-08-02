package com.techlabs.College_app;

import java.util.ArrayList;

public class College implements ISalary {

	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Professor> professorList = new ArrayList<Professor>();

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addProfessor(Professor professor) {
		professorList.add(professor);
	}

	public ArrayList<Professor> calculateSalary(ArrayList<Professor> profList) {

		for (Professor temp : profList)
			temp.setSalary(temp.getSalary() * temp.getHour());

		return profList;
	}

	public ArrayList<Professor> getProfessorList() {
		return this.professorList;
	}

	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}
}
