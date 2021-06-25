package com.bl.AddressBookSpringProject.exceptions;

@SuppressWarnings("serial")
public class AddressBookException extends NullPointerException{

	public AddressBookException(String message) {
		super(message);
	}
}
