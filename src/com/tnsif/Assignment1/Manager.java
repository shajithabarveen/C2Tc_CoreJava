package com.tnsif.Assignment1;

public class Manager extends Employee {
	public Manager(String name, int employeeId, double salary, 
	        double bonous,String department) {
super(name, employeeId, salary);
this.bonous = bonous;
this.department = department;
}

private double bonous;
private String department;
public double getBonous() {
	return bonous;
}
public void setBonous(double bonous) {
	this.bonous = bonous;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}



}
