package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public Customer getCustomer(long customerId);
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(long parseLong);
	
}
