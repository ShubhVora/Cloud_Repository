package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Employee;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee employee = new Employee("Shubham", 1, "Computer");

		employee.isPromotional();
		employee.calculateTax();
	}

}
