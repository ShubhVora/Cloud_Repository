package com.techlabs.factorypattern;

public class Toyota implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Toyota starts");
	}

	@Override
	public void stop() {
		System.out.println("Toyota stops");
	}

}