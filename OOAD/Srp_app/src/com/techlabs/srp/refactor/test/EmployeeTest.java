package com.techlabs.srp.refactor.test;

import com.techlabs.srp.refactor.Employee;
import com.techlabs.srp.refactor.FinancialDepartment;
import com.techlabs.srp.refactor.HrDepartment;

public class EmployeeTest {
	public static void main(String args[]){
		HrDepartment hrObject = new HrDepartment();
		FinancialDepartment financial = new FinancialDepartment();
		
		Employee employee = new Employee("Shubham",2, "Computer");
		
		hrObject.isPromotional();
		financial.calculateTax();
		
		
	}

}
