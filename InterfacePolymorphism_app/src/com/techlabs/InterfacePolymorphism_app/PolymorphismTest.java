package com.techlabs.InterfacePolymorphism_app;

public class PolymorphismTest {

	public static void main(String args[]) {
		PolymorphismTest obj = new PolymorphismTest();
		atTheMovies(new Boy());
		// obj.atTheMovies(new Man());
		atTheParty(new Boy());
		atTheParty(new Man());
	}

	public static void atTheMovies(IEmotional obj) {
		obj.cry();
		obj.laugh();
	}

	public static void atTheParty(IManable obj) {
		obj.desire();
		obj.wish();
	}
}
