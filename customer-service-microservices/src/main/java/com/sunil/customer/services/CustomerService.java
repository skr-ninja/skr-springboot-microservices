package com.sunil.customer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sunil.customer.entity.Customer;
import com.sunil.customer.model.MyOrders;
import com.sunil.customer.model.Product;
import com.sunil.customer.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;

	@Autowired
	RestTemplate restTemplate;

	public List<Customer> getAllProduct() {

		return repo.findAll();
	}

	public Customer saveCust(Customer c) {

		return repo.save(c);
	}

	public MyOrders getMyOrders(int custId) {
		
		Optional<Customer> cust = repo.findById(custId);
		int pid = cust.get().getPid();
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + pid, Product.class);
		MyOrders myOrders = new MyOrders();
		myOrders.setCustomer(cust.get());
		myOrders.setProduct(product);
		return myOrders;
	}

}
