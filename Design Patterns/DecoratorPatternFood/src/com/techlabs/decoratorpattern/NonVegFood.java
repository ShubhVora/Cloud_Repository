package com.techlabs.decoratorpattern;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(IFood newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood() + " Non-Veg food decorator ";
	}

	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}

}
