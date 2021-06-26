package com.bl.AddressBookSpringProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bl.AddressBookSpringProject.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="AddressBookEntries")
@Data
public class AddressBookData {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name= "ID")
	private int addressBookId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="PhoneNo")
	private String phoneNo;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="ZipCode")
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
