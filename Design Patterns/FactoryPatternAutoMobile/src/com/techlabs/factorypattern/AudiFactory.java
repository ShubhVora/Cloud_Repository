package com.techlabs.factorypattern;

public class AudiFactory implements IAutoFactory {

	public IAutoMobile make() {
		return new Audi();
	}

}