package com.tnsif.Assignment4;

public class Indigo implements AirFare
{
	 private int hours;
	    private double costPerHour;
		public  Indigo() {
			System.out.println("----- Indigo -----");

}
		public  Indigo(int hours, double costPerHour) {
			this();
			this.hours = hours;
			this.costPerHour = costPerHour;
		}

		public Double calculateAmmount() {
			return  (this.hours*this.costPerHour)*8;
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
