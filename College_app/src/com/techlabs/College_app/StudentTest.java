package com.techlabs.College_app;

public class StudentTest {
	public static void main(String args[]){
		Student st= new Student(100, "Address", 12, Branch.IT);
		
		System.out.println(st.getId());
		System.out.println(st.getAddress());
		System.out.println(st.getDOB());
		System.out.println(st.getBranch());
	}

}
