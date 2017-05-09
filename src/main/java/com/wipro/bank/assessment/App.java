package com.wipro.bank.assessment;

import com.wipro.bank.entity.Account;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static final List<Account> accounts = new ArrayList<Account>();
	private List<Account> emp2;

	public Account getAccountDetailsByID(int id) {
		Account emp1 = null;
		for (Account e : accounts) {
			if (e.getAccountID() == id) {
				emp1 = e;
			}

		}
		return emp1;

	}

	public List<Account> getAccountDetailsByBalance(double amount) {

		emp2 = new ArrayList<Account>();
		for (Account e : accounts) {
			if (e.getBalance() >= amount) {
				emp2.add(e);
			}
		}
		if (emp2.size() == 0) {
			emp2 = null;
		}
		return emp2;

	}

	public static void main(String[] args) {

		accounts.add(new Account(1, "Arun", 100010.11));
		accounts.add(new Account(2, "Sebai", 20100.13));
		accounts.add(new Account(3, "Mojo", 78301.22));
		accounts.add(new Account(4, "Sendrayan", 98401.55));
		accounts.add(new Account(5, "Bongani", 21501.77));
		accounts.add(new Account(6, "Tebza", 21601.22));
		accounts.add(new Account(7, "Ashley", 21701.11));
		accounts.add(new Account(7, "Shunny", 21801.99));

		App temp = new App();
		temp.getAccountDetailsByID(1);
		temp.getAccountDetailsByBalance(21501.77);

	}
}
