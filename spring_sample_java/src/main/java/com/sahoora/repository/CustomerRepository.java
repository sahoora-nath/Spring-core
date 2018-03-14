package com.sahoora.repository;

import java.util.List;

import com.sahoora.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}