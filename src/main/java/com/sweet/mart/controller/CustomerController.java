package com.sweet.mart.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweet.mart.dao.CustomerDAO;
import com.sweet.mart.model.Customer;




@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {


	@Autowired
	CustomerDAO customerDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Customer> getAllCustomers(){
		
		return customerDAO.getAllCustomers();
		
	}
	
	@PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registerCustomer(@RequestBody Customer customer) {
		
		System.out.println(customer);
		customerDAO.registerCustomer(customer);
	}
	
}
