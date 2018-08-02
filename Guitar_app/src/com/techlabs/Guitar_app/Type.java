package com.techlabs.Guitar_app;

public enum Type {
	ACOUSTIC, ELECTRIC;

	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		default:
			return "Not Found";
		}
	}

}
