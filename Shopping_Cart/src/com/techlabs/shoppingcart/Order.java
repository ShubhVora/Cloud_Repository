package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private Date date;
	private ArrayList<LineItem> cartProduct = new ArrayList<LineItem>();

	public Order(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	public ArrayList<LineItem> getArrayListOfItemList() {
		return this.cartProduct;
	}

	public void cancelOrder() {
		cartProduct = null;
	}

	public double checkOutPrice(ArrayList<LineItem> cartProduct) {
		double totalCost = 0.0;
		for (LineItem lineItem : cartProduct) {
			totalCost += lineItem.calculateTotalProductCost();
		}
		return totalCost;
	}

}
