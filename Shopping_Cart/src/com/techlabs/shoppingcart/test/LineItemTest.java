package com.techlabs.shoppingcart.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Product;

public class LineItemTest {

	@Test
	public void testTotalCostOfProduct() {
		Product product = new Product("Laptop", 1, 10, 100);
		LineItem lineItem = new LineItem(5, 2, product);

		assertTrue(450 == lineItem.calculateTotalProductCost());
	}

}
