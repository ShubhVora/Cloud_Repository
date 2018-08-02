package com.techlabs.AccountCurrent_Saving;

public class Current_Account extends Account {

	private float overDraft;
	static int AccountNumber = 1;

	Current_Account(float balance, String name) {
		super(AccountNumber, balance, name);
		overDraft = 10000;
		AccountNumber++;

	}

	public boolean withDraw(float amt) {
		if ((this.overDraft - amt) > 0 && this.getBalance() == 0) {
			overDraft = overDraft - amt;
			return true;
		} else if ((this.overDraft - amt) > 0 && this.getBalance() != 0) {
			if ((this.getBalance() - amt) < 0) {
				this.overDraft = this.overDraft + this.getBalance() - amt;
				this.setBalance(0);
				return true;
			} else {
				this.setBalance(this.getBalance() - amt);
				return true;
			}
		} else {

			return false;
		}

	}

	public float getOverDraft() {
		return overDraft;
	}

}
