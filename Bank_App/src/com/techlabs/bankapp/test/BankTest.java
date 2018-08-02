package com.techlabs.bankapp.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.techlabs.bankapp.Bank;
import com.techlabs.bankapp.Manager;
import com.techlabs.bankapp.Specialize;

public class BankTest {
	public static void main(String args[]) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String birthDateInString = "19/03/1996";
		Date birthDate = sdf.parse(birthDateInString);

		String joiningDateInString = "20/05/2018";
		Date joiningDate = sdf.parse(joiningDateInString);
		Manager managerobject = new Manager("Shubham", Specialize.EQUITY, birthDate, joiningDate, 10000.0, 1);

		Bank bank = new Bank();
		ArrayList<Manager> listOfManager = new ArrayList<Manager>();

		bank.addEmployee(managerobject);

		System.out.println(bank.getManagerList());

		bank.write(bank.getManagerList());

		listOfManager = bank.read();

		for (Manager manager : listOfManager)
			System.out.println(manager.getCode() + manager.getName() + " " + manager.getSpecialize() + " "
					+ manager.getBirthDate() + " " + manager.getJoiningDate() + " " + manager.getCtc() + " "
					+ manager.isWorkingStatus());

	}

}
