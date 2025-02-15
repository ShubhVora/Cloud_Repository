package com.techlabs.shoppingcart.test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class OrderTest {
	public static void main(String args[]) {
		Order order = new Order();
		Product product = new Product("Laptop", 1, 10, 100);
		LineItem lineItem = new LineItem(5, 1, product);

		Product product2 = new Product("Mobile", 1, 10, 100);
		LineItem lineItem2 = new LineItem(2, 1, product2);

		order.addToCart(lineItem);
		order.addToCart(lineItem2);

		for (LineItem lineItemFromArrayList : order.getArrayListOfItemList())
			System.out.println(
					lineItemFromArrayList.getQuantity() + " " + lineItemFromArrayList.getProduct().getProductName());

		order.updateProductQuantityFromCart(product, 2);

		for (LineItem lineItemFromArrayList : order.getArrayListOfItemList())
			System.out.println(
					lineItemFromArrayList.getQuantity() + " " + lineItemFromArrayList.getProduct().getProductName());

		order.deleteProductFromCart(product);
		for (LineItem lineItemFromArrayList : order.getArrayListOfItemList())
			System.out.println(lineItemFromArrayList.getQuantity() + " " + lineItemFromArrayList.getProduct());

	}

}
