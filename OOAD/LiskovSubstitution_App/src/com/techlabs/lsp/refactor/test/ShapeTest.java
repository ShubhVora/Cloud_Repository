package com.techlabs.lsp.refactor.test;

import com.techlabs.lsp.refactor.Rectangle;
import com.techlabs.lsp.refactor.Square;

public class ShapeTest {

	public static void main(String args[]) {

		System.out.println("Rectangle:");
		Rectangle rectangle = new Rectangle(10, 20);
		shouldNotChangeWidthWhenHeightIsMoved(rectangle);
		System.out.println("\n\nSquare:");
		Square square = new Square(20);
		// shouldNotChangeWidthWhenHeightIsMoved(square);
	}

	public static void shouldNotChangeWidthWhenHeightIsMoved(Rectangle rectangle) {
		int beforeWidth = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		int afterWidth = rectangle.getWidth();
		System.out.println("Before Width:" + beforeWidth + "\nAfter Width:" + afterWidth);
	}

}
