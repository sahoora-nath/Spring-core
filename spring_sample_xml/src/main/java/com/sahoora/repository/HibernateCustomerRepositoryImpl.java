package com.sahoora.repository;

import java.util.ArrayList;
import java.util.List;

import com.sahoora.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	private String dbUsername;
	
	/* (non-Javadoc)
	 * @see com.sahoora.repository.HibernateCustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println("DB USERNAME: "+dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Rabindra");
		customer.setLastName("Sahoo");
		customer.setEmail("rs@gmail.com");
		
		customers.add(customer);
		
		return customers;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
}
