package com.bl.AddressBookSpringProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bl.AddressBookSpringProject.services.IAddressBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressbook")
@Slf4j
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@GetMapping(value = {"","/",})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		List<AddressBookData> addressBookList = null;
		addressBookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{addId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
		AddressBookData addressBookData = addressBookService.getAddressBookDataById(addId);
		ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successfull", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData( @Valid @RequestBody AddressBookDTO addressBookDTO){
		log.debug("AddressBook DTO: "+addressBookDTO.toString());
		AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBOOK Data Successfull", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@PutMapping("/update/{addId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@Valid @PathVariable("addId") int addId, @RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = addressBookService.updateAddressBookData(addId, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBOOK Data Successfull", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	

	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("addId") int addId){
		addressBookService.deleteAddressBookData(addId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted ID: " + addId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
