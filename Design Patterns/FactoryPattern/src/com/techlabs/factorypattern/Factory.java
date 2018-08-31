package com.techlabs.factorypattern;

public class Factory {

	public IShape getInstance(String shape) {
		if (shape == null) {
			return null;
		} 
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
			return new Rectangle();
		
	}

}
