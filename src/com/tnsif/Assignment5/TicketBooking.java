package com.tnsif.Assignment5;

public class TicketBooking
{
	 private String stageEvent;
     private String customer;
     private int noOfSeats;
	
	public TicketBooking() 
	{
	}
	
		
		public TicketBooking(String stageEvent, String customer, int noOfSeats)
		{
			
			this.stageEvent = stageEvent;
			this.customer = customer;
			this.noOfSeats = noOfSeats;
		}
		public void makepayment(Double ammount)
		{
			System.out.println("Stage Event : "+this.stageEvent);
			System.out.println("Customer :"+this.customer);
			System.out.println("Number of seats :"+this.noOfSeats);
			System.out.println("Ammount "+ammount+" paid in cash");
		}
		public void makepayment(String walletNumber,Double ammount)
		{
			System.out.println("Stage Event: "+this.stageEvent);
			System.out.println("Customer : "+this.customer);
			System.out.println("Number of seats: "+this.noOfSeats);
			System.out.println("Ammount "+ammount+" paid using wallet number "+walletNumber);	
		}
		public void makepayment(String creditcard,String ccv,String holderName,Double ammount) 
		{
			System.out.println("Stage Event: "+this.stageEvent);
			System.out.println("Customer : "+this.customer);
			System.out.println("Number of seats: "+this.noOfSeats);
			System.out.println("Holder Name : "+holderName);
			System.out.println("Ammount "+ammount+" paid using"+creditcard +"card");	
			System.out.println("CCV: "+ccv);
		}
		
		public String getStageEvent() {
			return stageEvent;
		}

		public void setStageEvent(String stageEvent) {
			this.stageEvent = stageEvent;
		}

		public String getCustomer() {
			return customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public int getNoOfSeats() {
			return noOfSeats;
		}

		public void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}

	

	}
	

	