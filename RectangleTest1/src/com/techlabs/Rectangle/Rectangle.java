package com.techlabs.Rectangle;

public class Rectangle {

	private int Height, Width;
	String color;

	public void setHeight(int Height) {
		this.Height = check(Height);
	}

	public void setWidth(int Width) {
		this.Width = check(Width);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return this.Height;
	}

	public int getWidth() {
		return this.Width;
	}

	public static int check(int var) {
		if (var < 1)
			return 1;
		else if (var > 100)
			return 100;
		else
			return var;
	}

	public int CalculateArea() {
		return Height * Width;
	}

	public String checkColor() {
		int red = 0, green = 1, blue = 2;

		switch (color) {

		case "red":
			return "red";
		case "green":
			return "green";
		case "blue":
			return "blue";
		default:
			return "red";

		}
	}

}
