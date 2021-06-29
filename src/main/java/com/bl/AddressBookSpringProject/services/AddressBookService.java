package com.bl.AddressBookSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.AddressBookSpringProject.AddressBookRepository.AddressBookRepository;
import com.bl.AddressBookSpringProject.dto.AddressBookDTO;
import com.bl.AddressBookSpringProject.exceptions.AddressBookException;
import com.bl.AddressBookSpringProject.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	AddressBookRepository addressBookRepository;

	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int addId) {
		return addressBookRepository
			.findById(addId)
			.orElseThrow(() -> new AddressBookException("Data not found !! Invalid ID"));
	}

	@Override
	public AddressBookData createAddressBookData( AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookDTO);
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addId);
        addressBookData.updateAddressBookData(addressBookDTO);
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public void deleteAddressBookData(int addId) {
		AddressBookData addressBookData = addressBookRepository
				.findById( addId)
				.orElseThrow(() -> new AddressBookException("Delete cannot be succesfull !! Invalid ID"));
	    addressBookRepository.delete(addressBookData);
	}

	@Override
	public List<AddressBookData> getAddressBookDataByName(String name){
		return addressBookRepository.getAddressByName(name);
	}
}
