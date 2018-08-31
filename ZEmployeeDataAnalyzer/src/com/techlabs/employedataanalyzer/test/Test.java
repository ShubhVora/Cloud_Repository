package com.techlabs.employedataanalyzer.test;

import java.util.ArrayList;

import com.techlabs.employeedataanalyzer.Analyzer;
import com.techlabs.employeedataanalyzer.DiskLoader;
import com.techlabs.employeedataanalyzer.Employee;
import com.techlabs.employeedataanalyzer.Parser;
import com.techlabs.employeedataanalyzer.UrlLoader;

public class Test {

	public static void main(String args[]) {
		ArrayList<Employee> listDisk = new ArrayList<Employee>();
		ArrayList<Employee> listurl = new ArrayList<Employee>();

		DiskLoader diskloader = new DiskLoader();
		UrlLoader url = new UrlLoader();
		Analyzer analyzer = new Analyzer();

		Parser parser1 = new Parser(diskloader);
		Parser parser2 = new Parser(url);

		listDisk = parser1.getRecords(parser1.getParserList());
		listurl = parser2.getRecords(parser2.getParserList());

		System.out.println();

		System.out.println("Maximum Salary of disk:\t" + analyzer.maximumOfSalary(listDisk));
		System.out.println("department of disk:\t" + analyzer.totalEmployeeDepartment(listDisk, 30));
		System.out.println("designation of disk:\t" + analyzer.totalEmployeeDesignation(listDisk, "'MANAGER'"));

		System.out.println("Maximum Salary: of url\t" + analyzer.maximumOfSalary(listurl));
		System.out.println("Department number of url:\t" + analyzer.totalEmployeeDepartment(listurl, 30));
		System.out.println("Designation of url:\t" + analyzer.totalEmployeeDesignation(listurl, "'CLERK'"));

	}
}
