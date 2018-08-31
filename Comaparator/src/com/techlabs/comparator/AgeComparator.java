package com.techlabs.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<JobCandidate1> {

	@Override
	public int compare(JobCandidate1 candidate1, JobCandidate1 candidate2) {
		if (candidate1.getAge() < candidate2.getAge())
			return -1;
		else if (candidate1.getAge() > candidate2.getAge())
			return 1;
		else
			return 0;
	}
}
