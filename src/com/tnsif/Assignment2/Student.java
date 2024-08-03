package com.tnsif.Assignment2;
import java.util.Scanner;

public class Student {
	String name;
	int rollNo;
	char grade;
	double percentage;
	Scanner input;
	private char[] toString;
    public Student(){
    	System.out.println("..................................");
    	System.out.println("The student object is creted ");
    }
    public void  getStudentDetails() {
    	input=new Scanner(System.in);
    	System.out.println("Enter the student name with initial : ");
    	name=input.nextLine();
    	System.out.println("Enter the student Roll_Number : ");
    	rollNo=input.nextInt();
    	System.out.println("Enter the student grade : ");
    	grade=input.next().charAt(0);
        System.out.println("Enter the student percentage: "); 
        percentage=input.nextDouble();
        System.out.println("...................................");
    }
	@Override
	public String toString() {
		System.out.println("....................................");
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + ", percentage=" + percentage
				+ ", input=" + input + "]";
		
	}

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.getStudentDetails();
		System.out.print(s.toString());
		
		
		
	}

}
