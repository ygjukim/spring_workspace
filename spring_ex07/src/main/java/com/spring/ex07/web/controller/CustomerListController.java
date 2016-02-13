package com.spring.ex07.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ex07.biz.domain.Customer;
import com.spring.ex07.biz.service.CustomerService;
import com.spring.ex07.biz.service.DataNotFoundException;

@Controller
public class CustomerListController {

	@Autowired
	public CustomerService customerService;
	
	@RequestMapping(value="/customer", method=GET)
	public String showAllCustomers(Model model) {
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		return "customer/list";
	}
	
	@RequestMapping(value="/", method=GET) 
	public String home() {
		return "forward:/customer";
	}
	
	@RequestMapping(value="/customer/{customerId}", method=GET)
	public String showCustomerDEtail(@PathVariable int customerId, Model model) throws DataNotFoundException {
		Customer customer = customerService.findById(customerId);
		model.addAttribute("customer", customer);
		return "customer/detail";
	}
	
    @ExceptionHandler(DataNotFoundException.class)
    public String handleException() {
        return "customer/notfound";
    }
	
}
