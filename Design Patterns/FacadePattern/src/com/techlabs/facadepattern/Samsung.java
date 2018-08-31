package com.techlabs.facadepattern;

public class Samsung implements IMobile {
	@Override
	public void modelNo() {
		System.out.println("Samsung");
	}

	@Override
	public void price() {
		System.out.println("Rs.2000/-");
	}
}
