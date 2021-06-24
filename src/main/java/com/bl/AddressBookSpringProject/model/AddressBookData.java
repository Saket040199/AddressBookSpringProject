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
	
	public AddressBookData() {
		// TODO Auto-generated constructor stub
	}

	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		super();
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
	}
	
}
