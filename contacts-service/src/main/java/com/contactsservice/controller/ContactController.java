package com.contactsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactsservice.entity.Contacts;
import com.contactsservice.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	public ContactService contactService;
	
	@RequestMapping("/customer/{customerId}")
	public List<Contacts> getContacts(@PathVariable("customerId") Long customerId){
		return this.contactService.getContactsOfCustomer(customerId);
		
	}
}
