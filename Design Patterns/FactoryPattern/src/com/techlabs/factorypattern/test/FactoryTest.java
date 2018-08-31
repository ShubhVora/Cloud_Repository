package com.techlabs.factorypattern.test;

import com.techlabs.factorypattern.Factory;

public class FactoryTest {

	public static void main(String args[]) {
		Factory factory = new Factory();

		factory.getInstance("Circle").draw();

		factory.getInstance("Square").draw();

		factory.getInstance("Rectangle").draw();
	}

}
