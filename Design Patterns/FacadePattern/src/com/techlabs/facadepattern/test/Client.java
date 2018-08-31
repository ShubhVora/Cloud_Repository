package com.techlabs.facadepattern.test;

import java.util.Scanner;

import com.techlabs.facadepattern.ShopKeeper;

public class Client {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ShopKeeper shopKeeper = new ShopKeeper();
		
		shopKeeper.iphoneSale();
		shopKeeper.samsungSale();
		shopKeeper.blackBerrySale();
		
	   sc.close();
	}
}
