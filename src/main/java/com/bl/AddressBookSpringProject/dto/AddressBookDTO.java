package com.bl.AddressBookSpringProject.dto;

public class AddressBookDTO {

	public String name;
	public String address;
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + address + "]";
	}
	
	
}
