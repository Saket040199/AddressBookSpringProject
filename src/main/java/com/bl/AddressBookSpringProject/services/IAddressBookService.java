package com.bl.AddressBookSpringProject.services;

import java.util.List;

import com.bl.AddressBookSpringProject.dto.AddressBookDTO;
import com.bl.AddressBookSpringProject.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int addId);
	
	AddressBookData createAddressBookData( AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int addId);
}
