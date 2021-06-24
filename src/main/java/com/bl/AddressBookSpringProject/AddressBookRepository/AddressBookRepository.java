package com.bl.AddressBookSpringProject.AddressBookRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bl.AddressBookSpringProject.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Long>{

}