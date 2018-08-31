package com.techlabs.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(IShape shape) {
		super(shape);
	}

	public void draw() {
		setRedBorder();
	}

	public void setRedBorder() {
		super.draw();
		System.out.print(" with red Border.");
	}

}
