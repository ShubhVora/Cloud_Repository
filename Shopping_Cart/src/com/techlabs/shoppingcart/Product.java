package com.techlabs.shoppingcart;

public class Product {
	private String productName;
	private int productId;
	private double productCost, discount;

	public Product(String productName, int productId, int discount, float productCost) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.discount = discount;
		this.productCost = productCost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

	public double getDiscountPrice() {
		return this.productCost = this.productCost - this.productCost * this.discount * 0.01;
	}

}
