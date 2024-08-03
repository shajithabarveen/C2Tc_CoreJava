package com.tnsif.Assignment1;

public class Main {

	public static void main(String[] args)
	{
		Manager manager=new Manager("Shaji",101,200000,50000,"HR");
    	Developer developer=new Developer("sathiya",102,100000,"Automation","Java");
    	new EmpUtilities(manager);
    	new EmpUtilities(developer);
    	System.out.println("Total employees : "+Employee.getTotalEmployee());
		

	}

}
