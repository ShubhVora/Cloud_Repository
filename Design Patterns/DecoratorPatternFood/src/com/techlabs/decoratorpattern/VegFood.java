package com.techlabs.decoratorpattern;

public class VegFood implements IFood {

	@Override
	public String prepareFood() {
		return "Veg Food is prepared";
	}

	public double foodPrice() {
		return 50.0;
	}

}
