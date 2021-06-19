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
import com.bl.AddressBookSpringProject.dto.ResponseDTO;
import com.bl.AddressBookSpringProject.model.AddressBookData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@RequestMapping(value = {"","/",})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Tanya", "Hapur"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{addId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
		AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Tanya", "Hapur"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBOOK Data Successfull", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@PutMapping("/update/{addId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("addId") int addId, @RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBOOK Data Successfull", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("addId") int addId){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted ID: " + addId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
