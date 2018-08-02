package com.techlabs.chapterone;

public class Guitar implements Comparable<Guitar> {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numString) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood, numString);
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GuitarSpec getSpec() {
		return this.spec;
	}

	@Override
	public int compareTo(Guitar obj) {
		if (this.getPrice() < obj.getPrice())
			return -1;
		else if (this.getPrice() > obj.getPrice())
			return 1;
		else
			return 0;

	}


}
