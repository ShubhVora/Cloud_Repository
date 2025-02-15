package com.techlabs.shoppingcart;

public class LineItem {
	private int productQuantity, LineItemId;
	private Product product;

	public LineItem(int productQuantity, int LineItemId, Product product) {
		this.product = product;
		this.productQuantity = productQuantity;
		this.LineItemId = LineItemId;
	}

	public int getLineItemId() {
		return this.LineItemId;
	}

	public double calculateTotalProductCost() {
		return this.productQuantity * this.product.getDiscountPrice();
	}

	public Product getProduct() {
		return this.product;
	}

	public int getQuantity() {
		return this.productQuantity;
	}

	public void setQuantity(int quantity) {
		this.productQuantity = quantity;
	}

}
