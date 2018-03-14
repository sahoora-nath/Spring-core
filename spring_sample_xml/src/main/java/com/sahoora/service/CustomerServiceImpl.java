package com.sahoora.service;

import java.util.List;

import com.sahoora.model.Customer;
import com.sahoora.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.sahoora.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return getCustomerRepository().findAll();
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
