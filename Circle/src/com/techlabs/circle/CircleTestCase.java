package com.techlabs.circle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CircleTestCase {

	@Test
	public void testRadius() {
		Circle circle = new Circle();

		circle.setRadius(3.0f);

		assertTrue(3 == circle.getRadius());

	}

	@Test
	public void testArea() {
		Circle circle = new Circle();

		circle.setRadius(3.0f);

		assertTrue(9.42 == circle.calculatedArea());
	}
}
