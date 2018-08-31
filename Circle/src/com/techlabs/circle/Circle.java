package com.techlabs.circle;

public class Circle {

	private float radius;
	private BorderStyle style;

	public void setRadius(float radius) {
		this.radius = radius;

	}

	public void setBorderSytle(BorderStyle style) {
		this.style = style;
	}

	public BorderStyle getBorderSytle() {
		return this.style;
	}

	public double calculatedArea() {
		return this.radius * 3.14;
	}

	public float getRadius() {
		return this.radius;

	}

}
