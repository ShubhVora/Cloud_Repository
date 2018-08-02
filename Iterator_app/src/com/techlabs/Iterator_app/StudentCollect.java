package com.techlabs.Iterator_app;

	public class StudentCollect<Student> implements Iterable<Student>{
		private int counter;
		Student[] students;
		StudentCollect(int count, Student[] s){
			this.counter = count;
			this.students = s;
		}
		
		@Override
		public StudentIterator<Student> iterator() {
			return new StudentIterator<Student>(counter, students);
		}
		
	}

