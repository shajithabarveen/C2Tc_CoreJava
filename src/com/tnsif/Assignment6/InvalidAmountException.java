package com.tnsif.Assignment6;
@SuppressWarnings("serial")
public class InvalidAmountException extends Exception
{

	public String handleException() {
		  return new String("Invalid ammount: Ammount "
		  		           + "can't be negative ");
	  }
	

}
