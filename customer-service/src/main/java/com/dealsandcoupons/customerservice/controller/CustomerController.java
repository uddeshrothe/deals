package com.dealsandcoupons.customerservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dealsandcoupons.customerservice.model.Customer;
import com.dealsandcoupons.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") Long customerId) {
		
		Customer customer = this.customerService.getCustomer(customerId);
		
		List contacts = this.restTemplate.getForObject("http://localhost:9002/contacts/customer/" + customerId, List.class);
		
		customer.setContacts(contacts);
		return customer;
		
	}

}
