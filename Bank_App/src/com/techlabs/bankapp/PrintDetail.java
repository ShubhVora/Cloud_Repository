package com.techlabs.bankapp;

import java.util.ArrayList;

public class PrintDetail {

	public void Display(ArrayList<Manager> list) {
		System.out.println("Employee Name\t" + "Employee Code\t" + "Employee Joining Date\t" + "Employee Birthdate\t"
				+ "Employee Working Status\t" + "Employee CTC");
		for (Manager employee : list) {
			System.out.println(employee.getName() + "\t" + employee.getCode() + "\t" + employee.getJoiningDate() + "\t"
					+ employee.getBirthDate() + "\t" + employee.isWorkingStatus() + "\t" + employee.getCtc());
		}
	}

}
