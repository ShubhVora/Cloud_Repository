package com.techlabs.RTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	final static int DISPLAY = 1, SEARCH = 2, EXIT = 3;

	public static void main(String args[]) {
		int choice;

		String[] code = { "MH", "JK", "GJ", "RJ", "MP", "UP", "PJ" };
		String[] state = { "Maharastra", "Jammu Kashmir", "Gujarat", "Rajasthan", "Madhya Pradesh", "Uttar Pradesh",
				"Punjab" };
		ArrayList<RTO> list = new ArrayList<RTO>();

		Display display = new Display();
		Search search = new Search();
		Database db = new Database();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < code.length; i++) {
			list.add(new RTO(code[i], state[i]));
		}

		db.write(list);
		// list = db.readList();

		do {
			System.out.println("Enter your Choice:\n1.Display\n2.Search\n3.Exit");
			choice = sc.nextInt();

			switch (choice) {

			case DISPLAY:
				display.displayAll(list);
				break;
			case SEARCH:
				System.out.println("Enter the Character to be search:\t");
				char c = sc.next().charAt(0);
				ArrayList<RTO> searchedList = search.search(list, c);
				for (RTO temp : searchedList) {
					System.out.println(temp.getCode() + "\t" + temp.getState());
				}
				break;
			case EXIT:

			}
		} while (choice != 3);
		sc.close();
	}
}