package com.techlabs.facadepattern;

public class Iphone implements IMobile {
	@Override
	public void modelNo() {
		System.out.println(" Iphone ");
	}

	@Override
	public void price() {
		System.out.println("Rs.1000/-");
	}
}