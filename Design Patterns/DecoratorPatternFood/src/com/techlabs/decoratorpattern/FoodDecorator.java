package com.techlabs.decoratorpattern;

public abstract class FoodDecorator implements IFood {

	private IFood newFood;

	public FoodDecorator(IFood newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return this.newFood.prepareFood();
	}

	public double foodPrice() {
		return this.newFood.foodPrice();
	}

}
