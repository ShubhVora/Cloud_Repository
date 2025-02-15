package com.techlabs.shoppingcart.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.PrintDetail;
import com.techlabs.shoppingcart.Product;

public class OrderHistory {
	public static void main(String args[]) throws Exception {

		Customer customer = new Customer("Shubham", "Bhayandar", 2345);
		PrintDetail display = new PrintDetail();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String orderDateString = "27/07/2018";
		Date orderDate = sdf.parse(orderDateString);

		Order order = new Order(orderDate);

		Product product1 = new Product("Laptop", 1, 10, 10000);
		Product product2 = new Product("Mobile", 2, 15, 15000);

		LineItem lineItem1 = new LineItem(5, 1, product1);
		LineItem lineItem2 = new LineItem(5, 2, product2);

		customer.addToCart(lineItem1, order.getArrayListOfItemList());
		customer.addToCart(lineItem2, order.getArrayListOfItemList());

		display.dispayCustomerOrder(order);

	}

}
