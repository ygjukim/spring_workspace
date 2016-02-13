package com.spring.ex07.biz.service;

import java.util.List;

import com.spring.ex07.biz.domain.Customer;

public abstract class MockCustomerService implements CustomerService {

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer register(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFreeEmailCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findById(int id) throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Customer customer) throws DataNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DataNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
