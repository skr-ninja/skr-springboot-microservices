package com.sunil.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.customer.entity.Customer;
import com.sunil.customer.model.MyOrders;
import com.sunil.customer.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {

		return service.saveCust(customer);
	}

	@GetMapping("myorders/{cid}")
	public MyOrders myOreders(@PathVariable("cid") int custId) {

		return service.getMyOrders(custId);
	}

}
