package com.techlabs.decoratorpattern;

public abstract class ShapeDecorator implements IShape {

	private IShape shape;

	public ShapeDecorator(IShape shape) {
		this.shape = shape;
	}

	public void draw() {
		this.shape.draw();
	}

}
