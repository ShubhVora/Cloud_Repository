package com.techlabs.InterfacePolymorphism_app;

public class Boy implements IEmotional, IManable {

	public void cry() {
		System.out.println("Cry in Boy");
	}

	public void laugh() {
		System.out.println("Laugh in Boy");
	}

	public void wish() {
		System.out.println("wish in Boy");
	}

	public void desire() {
		System.out.println("desire in Boy");
	}
}
