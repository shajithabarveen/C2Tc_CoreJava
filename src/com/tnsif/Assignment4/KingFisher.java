package com.tnsif.Assignment4;

public class KingFisher implements AirFare
{
	 private int hours;
	   private double costPerHour;
		public KingFisher() {
			System.out.println("----- KingFisher -----");
		}

		
		public KingFisher(int hours, double costPerHour) {
			this();
			this.hours = hours;
			this.costPerHour = costPerHour;
		}
		@Override
		public Double calculateAmmount() {
			return  (this.hours*this.costPerHour)*4;
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
