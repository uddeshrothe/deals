package com.dealsandcoupons.customerservice.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.dealsandcoupons.customerservice.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	List<Customer> list = List.of(
			new Customer(1311, "Jay"),
			new Customer(1411, "Jenny"),
			new Customer(1511, "Jax")
			);
	
	@Override
	public Customer getCustomer(Long id) {
		
		return this.list.stream().filter(customer ->customer.getCustomerId().equals(id)).findAny().orElse(null);
	}

}
