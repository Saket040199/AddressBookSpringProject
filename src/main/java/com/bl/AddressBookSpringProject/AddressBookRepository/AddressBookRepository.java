package com.bl.AddressBookSpringProject.AddressBookRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bl.AddressBookSpringProject.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer>{
  
	@Query(value = "select * from address_book_entries a where a.name LIKE %:name%", nativeQuery = true)
	List<AddressBookData> getAddressByName(@Param("name") String name);

}