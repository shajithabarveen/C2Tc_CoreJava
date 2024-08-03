package com.tnsif.Assignment6;

public class BankAccount
{
	  private int accountNumber;
	    private double balance;
	    
	    public BankAccount(int accountNumber, double balance) {
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		public String deposit(double ammount) {
			this.balance=this.balance+ammount;
			return new String("Deposit the ammount :"
			                  +ammount+" succesfully... ");
		}

		public String withdrawal(double ammount) 
				                throws InsufficientFundException {
			if(this.balance<ammount) {
				 throw new InsufficientFundException();
			}
			this.balance=this.balance-ammount;
			return new String("Withdrawal the ammount "
			                  +ammount +" succesfully... ");
		}
		
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
	     

}
