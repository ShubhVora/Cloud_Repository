package com.techlabs.RTO;

import java.util.ArrayList;

public class Search {

	public ArrayList<RTO> search(ArrayList<RTO> list, char c) {
		
		ArrayList<RTO> searchedList = new ArrayList<RTO>();
		for (RTO temp : list) {
			for (int i = 0; i < temp.getState().length(); i++) {
				if (temp.getState().charAt(i) == c) {
					searchedList.add(list.get(i));
				}
			}
		}
		return searchedList;
	}

}
