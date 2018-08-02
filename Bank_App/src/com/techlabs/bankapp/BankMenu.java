package com.techlabs.bankapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BankMenu {

	public static void main(String args[]) throws Exception {

		int option;
		Scanner sc = new Scanner(System.in);
		ArrayList<Manager> list = new ArrayList<Manager>();
		
		do{
			System.out.println("Enter the following options to perform action\n1.Store\n2.Retrieve\n3.Exit.");
			choice = sc.nextInt()
			
		}while(option!=3)
		System.out.println("Enter the details of Employee");
		System.out.println("Enter name of Employee");
		String name = sc.next();
		System.out.println("Enter Birthdate of Employee");
		String birthDate = sc.next();
		System.out.println("Enter JoiningDate of Employee");
		String joiningDate = sc.next();
		System.out.println("Enter Working Status of employee 1 for yes & 2 for no");
		int working = sc.nextInt();
		boolean workingStatus = false;
		if (workingStatus(working)) {
			System.out.println("Enter CTC of Employee");
			ctc = sc.nextDouble();
			workingStatus = true;
		}
		DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		Date birth = df.parse(birthDate);
		Date joining = df.parse(joiningDate);
		if (check.joiningIsPossible(birth, joining)) {
			Manager employee = new Manager();
			employee.setName(name);
			employee.setCode();
			employee.setBirthDate(birth);
			employee.setJoiningDate(joining);
			employee.setWorkingStatus(workingStatus);
			employee.setCtc(ctc);
			employee.setSpecialize(Specialize.Insurance);
			list.add(employee);
		}
		PrintDetail print = new PrintDetail();

		print.Display(list);

	}

}
