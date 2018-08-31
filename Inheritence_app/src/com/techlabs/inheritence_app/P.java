package com.techlabs.inheritence_app;

public class P {

	private int food;

	P() {
		System.out.println("P is present");
	}

	P(int food) {
		this.food = food;
	}

	public int getFood() {
		return food;
	}
}
