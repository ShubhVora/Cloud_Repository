package com.techlabs.InterfacePolymorphism_app;

public class PolymorphismTest {

	public static void main(String args[]) {
		PolymorphismTest obj = new PolymorphismTest();
		obj.atTheMovies(new Boy());
		obj.atTheParty(new Boy());
		obj.atTheParty(new Man());
	}

	public void atTheMovies(IEmotional obj) {
		obj.cry();
		obj.laugh();
	}

	public void atTheParty(IManable obj) {
		obj.desire();
		obj.wish();
	}
}
