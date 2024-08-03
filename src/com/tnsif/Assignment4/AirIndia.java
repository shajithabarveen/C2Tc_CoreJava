package com.tnsif.Assignment4;

public class AirIndia implements AirFare{
	private int hours;
    private double costPerHour;
    
    public AirIndia(int hours, double costPerHour) {
		this();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
    
    public AirIndia() {
		System.out.println("----- AirIndia -----");	
	}
    
    public Double calculateAmmount() {

		return this.hours*this.costPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
    
    
    

}
