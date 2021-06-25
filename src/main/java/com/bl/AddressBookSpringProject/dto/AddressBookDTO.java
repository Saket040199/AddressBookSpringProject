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
    
    @Pattern(regexp = "^[0-9]{10}$", message= "InValid PhoneNo")
    public String phoneNo;
    
    @NotEmpty(message = "City should not ne null")
    public String city;
    
    @NotEmpty(message = "State should not ne null")
    public String state;
    
    @Pattern(regexp = "^[0-9]{6}$", message= "Invalid PinCode")
    public String zipCode;
	
    public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
    
	public AddressBookDTO(String name,String address, String phoneNo, String city, String state,
			String zipCode) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
		
}
