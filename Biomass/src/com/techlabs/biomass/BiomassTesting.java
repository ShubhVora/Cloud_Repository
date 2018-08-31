package com.techlabs.biomass;

public class BiomassTesting {

	public static void main(String args[]) {
		Biomass mass = new Biomass();
		mass.setparameter(60, 1.78);
		System.out.println(mass.caculateBMI());

		mass.eat(6);
		System.out.println("After Lunch:\t" + mass.caculateBMI());

		mass.workout(46);
		System.out.println("After Workout:\t" + mass.caculateBMI());
	}
}
