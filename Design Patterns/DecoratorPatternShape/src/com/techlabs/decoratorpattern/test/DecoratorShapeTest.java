package com.techlabs.decoratorpattern.test;

import com.techlabs.decoratorpattern.Circle;
import com.techlabs.decoratorpattern.IShape;
import com.techlabs.decoratorpattern.Rectangle;
import com.techlabs.decoratorpattern.RedShapeDecorator;

public class DecoratorShapeTest {
	public static void main(String args[]) {
		IShape circle = new Circle();
		IShape rectangle = new Rectangle();

		IShape circleBorder = new RedShapeDecorator(circle);
		IShape rectangleBorder = new RedShapeDecorator(rectangle);

		circle.draw();
		rectangle.draw();
		circleBorder.draw();;
		rectangleBorder.draw();

	}
}
