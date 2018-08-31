package com.techlabs.RTO;

import java.util.ArrayList;

public class Search {

	public ArrayList<RTO> search(ArrayList<RTO> list, char c) {

		ArrayList<RTO> searchedList = new ArrayList<RTO>();
		for (RTO temp : list) {
			String str = temp.getState().toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					searchedList.add(temp);
					break;
				}
			}
		}
		return searchedList;
	}

}
