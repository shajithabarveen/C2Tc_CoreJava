package com.tnsif.Assignment6;
@SuppressWarnings("serial")
public class InsufficientFundException extends Exception
{
	 public String handleException() {
		  return new String("Your account balance is low ");
	  }

}
