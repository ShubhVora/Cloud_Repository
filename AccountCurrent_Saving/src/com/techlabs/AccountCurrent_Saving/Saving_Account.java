package com.techlabs.AccountCurrent_Saving;

public class Saving_Account extends Account {

	static int AccountNumber = 1;

	Saving_Account(float balance, String name) {
		super(AccountNumber, balance, name);
		AccountNumber++;
	}

	public boolean withDraw(float amt) {
		if ((this.getBalance() - amt) > 4000) {
			this.setBalance(this.getBalance() - amt);
			return true;
		} else {
			return false;
		}
	}

}
