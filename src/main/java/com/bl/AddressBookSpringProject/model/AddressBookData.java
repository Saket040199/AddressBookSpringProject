package com.bl.AddressBookSpringProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bl.AddressBookSpringProject.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="AddressBookEntries")
@Data
public class AddressBookData {

	@Id
	private int addressBookId;
	private String name;
	private String address;
	private String phoneNo;
	private String city;
	private String state;
	private String zipCode;
	
	
	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		super();
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
		this.phoneNo = addressBookDTO.phoneNo;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zipCode = addressBookDTO.zipCode;
	}
	
}
