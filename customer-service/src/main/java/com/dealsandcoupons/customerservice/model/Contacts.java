package com.dealsandcoupons.customerservice.model;

public class Contacts {
	
	private Long cId;
	private String email;
	
	private Long customerId;

	public Contacts(Long cId, String email, Long customerId) {
		super();
		this.cId = cId;
		this.email = email;
		this.customerId = customerId;
	}
	
	public Contacts() {}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	

}
