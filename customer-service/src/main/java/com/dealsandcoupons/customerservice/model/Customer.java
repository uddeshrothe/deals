package com.dealsandcoupons.customerservice.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private Long customerId;
	private String name;
	
	List<Contacts> contacts = new ArrayList<>();

	public Customer(long customerId, String name, List<Contacts> contacts) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.contacts = contacts;
	}

	public Customer(long customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	
	public Customer() {}

	public Long getCustomerId() {
		return customerId;
	}

	public void setUserId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}
	
	

}
