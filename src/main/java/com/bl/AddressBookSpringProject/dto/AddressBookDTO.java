package com.bl.AddressBookSpringProject.dto;

import lombok.Data;

@Data
public class AddressBookDTO {

	public String name;
	public String address;
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
		
}
