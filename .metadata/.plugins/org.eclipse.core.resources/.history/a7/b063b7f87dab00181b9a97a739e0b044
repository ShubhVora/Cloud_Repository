package com.techlabs.employeedataanalyzer;

import java.util.ArrayList;

public class Analyzer {

	public float maximumOfSalary(ArrayList<Employee> employeeList) {
		float max = 0;
		for (Employee temp : employeeList) {
			if (max < temp.getSalary())
				max = temp.getSalary();
		}
		return max;
	}

	public int totalEmployeeDepartment(ArrayList<Employee> employeeList, int deptNo) {
		int count = 0;
		for (Employee temp : employeeList) {
			if (temp.getDeptNo() == deptNo)
				count++;
		}
		return count;
	}

	public int totalEmployeeDesignation(ArrayList<Employee> employeeList, String designation) {
		int count = 0;
		for (Employee temp : employeeList) {
			String str = temp.getDesignation();
			if (str.equals(designation))
				count++;
		}
		return count;
	}

}
