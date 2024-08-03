package com.tnsif.Assignment2;

import java.util.Scanner;

public class Commision 
{
	String name;
    String address;
    long phone;
    double salesAmount;
    static Scanner input;
    
    public Commision() {
		input=new Scanner(System.in);
		System.out.println("Enter the Salesman Name: ");
		this.name=input.nextLine();
		System.out.println("Enter the Address for "+this.name+" : ");
		this.address = input.nextLine();
		System.out.println("Enter the phonenumber for "+this.name+" : ");
		this.phone = input.nextLong();
		System.out.println("Enter the SalesAmmount for "+this.name+" : ");
		this.salesAmount = input.nextDouble();
		System.out.println("-------------------------------------------------------------------------------");
	}
    
    public double calculateCommision() {
		if(this.salesAmount>=100000) {
			return ((double)10/100)*this.salesAmount;
		}
		else if(50000<=this.salesAmount && this.salesAmount<100000) {
			return ((double)5/100)*this.salesAmount;
		}
		else if(30000<=this.salesAmount && this.salesAmount<50000) {
			 return ((double)3/100)*this.salesAmount;
		}
		else {
          return 0.0;
		}
	}
    
    

	@Override
	public String toString() {
		return "Commision [name=" + name + ", address=" + address + ", phone=" + phone + ", salesAmount=" + salesAmount
				+ "]";
	}

	public static void main(String[] args)
	{
		Commision commission1=new Commision();
		System.out.println(commission1);
		System.out.println("["+commission1.name+" sale commission : "+commission1.calculateCommision()+"]");
		System.out.println("-------------------------------------------------------------------------------");
		
	}

}
