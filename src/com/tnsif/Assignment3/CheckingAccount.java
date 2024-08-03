package com.tnsif.Assignment3;
import java.util.Scanner;

public class CheckingAccount extends Account
{
	static Scanner input=new Scanner(System.in);;
	public CheckingAccount(String username, String pin) {
          super(username,pin);
		
	}

	void deposit() {
		
		System.out.println("Enter the deposit ammount: ");
		Double amount=input.nextDouble();
		this.setAccBalance(this.getAccBalance()+amount);
		System.out.println(this.getUsername()+
	    	                   " Succesfully deposit the amount ");
	}

	void withdraw() {
		
		System.out.println("welcome "+this.getUsername());
		System.out.println("Enter the withdraw ammount: ");
		Double amount=input.nextDouble();
		if(amount<=this.getAccBalance()) {
			System.out.println(this.getUsername()+
	    	                   " Succesfully withdraw the amount ");
			this.setAccBalance(this.getAccBalance()-amount);
		}
		else {
			System.out.println(this.getUsername()+"your account balance is less");
		}
	   
		
	}

	double getBalance() {
		return this.getAccBalance();
	}
	

}
