package com.techlabs.shoppingcart;

import java.util.ArrayList;

public class PrintDetail {

	public void dispayCustomerOrder(Order order) {
		ArrayList<LineItem> cartProduct = order.getArrayListOfItemList();

		System.out.println("Product Name\tProductQuantity\t\tTotal Product Cost");
		for (LineItem lineItem : cartProduct) {
			System.out.println(lineItem.getProduct().getProductName() + "\t\t\t" + lineItem.getQuantity() + "\t\t\tRs."
					+ lineItem.calculateTotalProductCost());

		}

		System.out.println("\nordered Date:\t" + order.getDate());
		System.out.println("\nTotal cost of order:\tRs." + order.checkOutPrice(cartProduct));
	}

}
