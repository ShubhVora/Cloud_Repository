package com.techlabs.factorypattern;

public class BMWFactory implements IAutoFactory {

	public IAutoMobile make() {
		return new BMW();
	}

}
