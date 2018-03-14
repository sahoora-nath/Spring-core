package com.sahoora.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sahoora.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.sahoora.repository.HibernateCustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Rabindra");
		customer.setLastName("Sahoo");
		customer.setEmail("rs@gmail.com");
		
		customers.add(customer);
		
		return customers;
	}
}
