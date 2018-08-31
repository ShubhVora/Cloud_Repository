package com.techlabs.facadepattern;

public class BlackBerry implements IMobile {
	@Override
	public void modelNo() {
		System.out.println(" BlackBerry ");
	}

	@Override
	public void price() {
		System.out.println("Rs.3000/- ");
	}
}
