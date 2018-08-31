package com.techlabs.comparator;

import java.util.Collections;
import java.util.List;

public class CandidateSort1 {

	public void getSortedListOfCandidiate(List<JobCandidate1> candidates) {
		Collections.sort(candidates, new JobCandidate1());
	}
}
