package Account;

public class Account {
	private int account_no;
	private double balance;
	private String name;
	public static int count = 0;
	public static int account_number = 101;

	Account(double balance, String name) {
		this.account_no = account_number;
		this.balance = balance;
		this.name = name;
		count++;
		account_number++;
	}

	Account(String name) {
		this(1000, name);
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;

	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.account_no;
	}

	public String getName() {
		return this.name;
	}

	public Account whoIsRich(Account account2) {
		if (this.balance > account2.balance) {
			return this;
		} else {
			return account2;
		}
	}

}
