package com.techlabs.facadepattern;

public class ShopKeeper {
	
	private IMobile iphone;
	private IMobile samsung;
	private IMobile blackBerry;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackBerry = new BlackBerry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blackBerrySale() {
		blackBerry.modelNo();
		blackBerry.price();
	}
}