package com.techlabs.invoice.violation.test;

import com.techlabs.invoice.violation.Invoice;

public class InvoiceTest {
	public static void main(String args[])
	{
		Invoice invoice = new Invoice(1,0.0,10,5,"Shubham");
		
		invoice.calculateDiscount();
		invoice.calculateTax();
		invoice.calculatTotalCost();
		invoice.printDetail();
	}

}
