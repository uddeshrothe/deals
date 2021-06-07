package com.contactsservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactsservice.entity.Contacts;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contacts> list = List.of(
			new Contacts(1L,"user@gmail.com", 1311L),
			new Contacts(2L,"user2@gmail.com", 1411L),
			new Contacts(3L, "user3@gmail.com",1511L)
			);

	@Override
	public List<Contacts> getContactsOfCustomer(Long customerId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contacts ->contacts.getCustomerId().equals(customerId)).collect(Collectors.toList());
	}

}
