package com.tnsif.Assignment3;
import java.util.Scanner;

public final class Transaction
{
	static  Scanner input;
    static final int transactionfee;
   
    static
    {
   	 transactionfee=50;
   	 input=new Scanner(System.in);
    }
    
    
    public Transaction(Account from)
          {
   	
   	 System.out.println("Enter the {To} transaction accNo: ");
   	 double accNo=input.nextDouble();
        boolean validac=false;
   	
        for(Account to:Account.users)
        {
        	
   		 if(to.getAccNo()==accNo) {
   			 validac=!validac;
   			 System.out.println("Enter the transaction ammount: ");
   			 double amount=input.nextDouble();
   			 if(from.getAccBalance()>=amount- transactionfee) {
   				from.setAccBalance(from.getAccBalance()-amount- transactionfee);
   				to.setAccBalance(to.getAccBalance()+amount);
   				System.out.println("Succesfully transaction  the amount");
   				System.out.println(to.getAccBalance());
   				break;
   			 }
   			 else {
   				 System.out.println(from.getUsername()+" Your account balance is less");
   				 break;
   			 }
   		 }
   	 }
   	 if(!validac) 
   	 {
   		 System.out.println("Invalid {To} Account");
   	 }
   	
    }

}
