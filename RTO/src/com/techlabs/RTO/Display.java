package com.techlabs.RTO;

import java.util.ArrayList;

public class Display {

	public void displayAll(ArrayList<RTO> list) {
		for (RTO temp : list) {
			System.out.println("" + temp.getCode() + "\t" + temp.getState());
		}
	}

}
