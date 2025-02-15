package com.techlabs.shoppingcart;

import java.util.ArrayList;

public class Customer {
	private String name, address;
	private int contact;

	public Customer(String name, String address, int contact) {
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public void addToCart(LineItem lineItem, ArrayList<LineItem> cartProduct) {
		cartProduct.add(lineItem);
	}

	public void deleteProductFromCart(Product product, ArrayList<LineItem> cartProduct) {

		for (LineItem lineItem : cartProduct) {
			if (lineItem.getProduct() == product) {
				cartProduct.remove(lineItem);
			}
		}
	}

}
