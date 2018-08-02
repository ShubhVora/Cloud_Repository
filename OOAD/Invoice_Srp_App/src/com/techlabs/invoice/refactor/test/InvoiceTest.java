package com.techlabs.invoice.refactor.test;

import com.techlabs.invoice.refactor.Invoice;
import com.techlabs.invoice.refactor.PrintDetailOfInvoice;

public class InvoiceTest {
	public static void main(String args[])
	{
		Invoice invoice = new Invoice(1,0.0,10,5,"Shubham");
        PrintDetailOfInvoice printDetail = new PrintDetailOfInvoice();		
		invoice.calculateDiscount();
		invoice.calculateTax();
		invoice.calculatTotalCost();
		printDetail.printDetail();
		
	}


}
