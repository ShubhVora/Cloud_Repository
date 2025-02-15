package com.techlabs.bankapp.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlabs.bankapp.Manager;
import com.techlabs.bankapp.Specialize;

public class ManagerTest {
	public static void main(String args[]) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String birthDateInString = "19/03/1996";
		Date birthDate = sdf.parse(birthDateInString);

		String joiningDateInString = "20/05/2018";
		Date joiningDate = sdf.parse(joiningDateInString);
		Manager manager = new Manager("Shubham", Specialize.EQUITY, birthDate, joiningDate, 10000.0, 1);

		System.out.println(
				manager.getCode() + manager.getName() + " " + manager.getSpecialize() + " " + manager.getBirthDate()
						+ " " + manager.getJoiningDate() + " " + manager.getCtc() + " " + manager.isWorkingStatus());
	}

}
