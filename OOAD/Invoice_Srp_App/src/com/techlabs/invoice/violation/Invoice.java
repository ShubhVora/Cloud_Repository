package com.techlabs.invoice.violation;

public class Invoice {
	private int id, discount, gst;
	private String name;
	private double cost;

	public Invoice(int id, double cost, int discount, int gST, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.discount = discount;
		gst = gST;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getGST() {
		return gst;
	}

	public void setGST(int gST) {
		gst = gST;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void calculateTax() {
		System.out.println("Calculate Tax");
	}

	public double calculateDiscount() {
		return (this.cost * this.discount * 0.01);
	}

	public double calculatTotalCost() {
		return this.cost = this.cost - (this.cost * this.discount * 0.01);
	}

	public void printDetail() {
		System.out.println("Details of all the calculated price");
	}

}
