package com.bl.AddressBookSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookSpringProjectApplication.class, args);
	
		log.info("Employee Payroll app started in {} environment",
				  context.getEnvironment().getProperty("environment"));
	}

}
