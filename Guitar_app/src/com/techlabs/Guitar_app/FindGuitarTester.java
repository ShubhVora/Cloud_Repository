package com.techlabs.Guitar_app;

import java.util.Collections;
import java.util.List;

public class FindGuitarTester {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		inventory.addGuitar("V9513", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.BRAZILIAN_ROSEWOOD, 12);
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);
		Collections.sort(inventory.getList());
		display(inventory.getList());

		List<Guitar> matchingList = inventory.search(whatErinLikes);
		if (!matchingList.isEmpty()) {
			System.out.println("Erin you might like this guitars:");
			for (Guitar guitar : matchingList) {
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getNumString()
						+ " " + spec.getType() + "guitar:\n" + spec.getBackWood() + " back and sides,\n "
						+ spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n---");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {

	}

	public static void display(List<Guitar> list) {
		for (Guitar guitar : list) {
			GuitarSpec spec = guitar.getSpec();
			System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getNumString()
					+ " " + spec.getType() + "guitar:\n" + spec.getBackWood() + " back and sides,\n "
					+ spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n---");
		}
	}

}
