package com.tnsif.Assignment3;

import java.util.ArrayList;

public abstract class Account 
{
	private static long tempno;
	static {
		tempno=1234567890;
	}
	static ArrayList<Account> users=new ArrayList<Account>();
	private long accNo;
	private String username;
	private String pin;
	private double accBalance;
	
	
    abstract void deposit();
    abstract void withdraw();
    abstract double  getBalance();
    
    public Account(String username, String pin) {
		new Bank();
		this.username = username;
		this.pin = pin;
		this.accBalance=5000;
		this.accNo=tempno;
		users.add(this);
		tempno++;
		
	}
	public static long getTempno() {
		return tempno;
	}
	public static void setTempno(long tempno) {
		Account.tempno = tempno;
	}
	public static ArrayList<Account> getUsers() {
		return users;
	}
	public static void setUsers(ArrayList<Account> users) {
		Account.users = users;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
    
    
}
