package com.bl.AddressBookSpringProject.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {
	
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message= " InValid Name")
	public String name;
    
    @NotEmpty(message="Address Should not be null")
	public String address;
    
    
    public long phoneNo;
    public String city;
    public String state;
    public int zipCode;
	
    public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
    
	public AddressBookDTO(String name,String address, long phoneNo, String city, String state,
			int zipCode) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
		
}
