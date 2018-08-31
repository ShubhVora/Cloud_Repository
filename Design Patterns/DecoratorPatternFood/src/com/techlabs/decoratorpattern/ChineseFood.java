package com.techlabs.decoratorpattern;

public class ChineseFood extends FoodDecorator {
	public ChineseFood(IFood newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood()+" Chinese food decorator ";
	}

	public double foodPrice() {
		return super.foodPrice()+150.0;
	}
}