package com.techlabs.bankapp;

public enum Specialize {
	INSURANCE, EQUITY, MUTUALFUND;

	public String toString() {
		switch (this) {
		case INSURANCE:
			return "Insurance";
		case EQUITY:
			return "Equity";
		case MUTUALFUND:
			return "MutualFunds";
		default:
			return "not present";

		}
	}

}
