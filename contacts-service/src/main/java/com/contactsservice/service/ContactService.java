package com.contactsservice.service;

import java.util.List;

import com.contactsservice.entity.Contacts;

public interface ContactService {

	public List<Contacts> getContactsOfCustomer(Long customerId);
}
