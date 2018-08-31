package com.techlabs.decoratorpattern.test;

import com.techlabs.decoratorpattern.ChineseFood;
import com.techlabs.decoratorpattern.FoodDecorator;
import com.techlabs.decoratorpattern.IFood;
import com.techlabs.decoratorpattern.NonVegFood;
import com.techlabs.decoratorpattern.VegFood;

public class DecoratorPatternTest {

	public static void main(String args[]) {
		IFood vegFood = new VegFood();
		
		System.out.println(vegFood.prepareFood());
		System.out.println(vegFood.foodPrice());
		
		IFood foodDecorator = new NonVegFood(vegFood);
		System.out.println(foodDecorator.prepareFood());
		System.out.println(foodDecorator.foodPrice());
		
		
		IFood foodDecorator1 = new ChineseFood(vegFood);
		System.out.println(foodDecorator1.prepareFood());
		System.out.println(foodDecorator1.foodPrice());
	
	}
}
