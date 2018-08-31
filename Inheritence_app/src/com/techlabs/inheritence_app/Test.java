package com.techlabs.inheritence_app;

public class Test {
	public static void main(String[] args) {
		Q q = new Q(400);

		A a = new A();
		B b = new B();

		System.out.println("foof value is:-" + q.getFood());
	}

}
