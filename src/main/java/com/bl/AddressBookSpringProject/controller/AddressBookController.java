package com.bl.AddressBookSpringProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.AddressBookSpringProject.dto.AddressBookDTO;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getAddressBookData(){
	return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

	@GetMapping("/get/{addId}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("addId") int addId){
	return new ResponseEntity<String>("Get Call Success for id" +addId, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
	return new ResponseEntity<String>("Updated AddressBook Data for: "+addressBookDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
	return new ResponseEntity<String>("Updated AddressBook Data for: "+addressBookDTO, HttpStatus.OK);
	}


	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("addId") int addId){
		return new ResponseEntity<String>("Delete Call Success for id: "+addId,HttpStatus.OK);
	}
}
