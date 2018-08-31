package com.techlabs.singletonwithenum;

public enum Singleton {
	INSTANCE;

	private int value;

	Singleton() {
		value = 10;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
