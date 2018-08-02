package com.techlabs.shoppingcart.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.techlabs.shoppingcart.Product;

public class ProductTest {

	@Test
	public void testPriceAfterDiscount() {
		Product product = new Product("Laptop", 1, 10, 100);

		assertTrue(90 == product.getDiscountPrice());
	}
}
