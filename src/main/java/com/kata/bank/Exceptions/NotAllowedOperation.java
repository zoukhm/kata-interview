package com.kata.bank.Exceptions;

public class NotAllowedOperation extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5151993333695806859L;
	
	public NotAllowedOperation(String message) {
		super(message);
	}

}
