package com.tnsif.Assignment3;

public class Bank {
	static int totalAccounts;
	static {
		totalAccounts=0;
	}
	public Bank(){
		totalAccounts++;
	}
	public static int getTotalAccounts() {
		return totalAccounts;
	}

}
