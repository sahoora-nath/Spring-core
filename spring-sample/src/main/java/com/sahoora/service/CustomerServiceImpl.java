package com.sahoora.service;

import java.util.List;

import com.sahoora.model.Customer;
import com.sahoora.repository.CustomerRepository;
import com.sahoora.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.sahoora.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
