package com.techlabs.factorypattern;

public class ToyotaFactory implements IAutoFactory {

	public IAutoMobile make() {
		return new Toyota();
	}

}