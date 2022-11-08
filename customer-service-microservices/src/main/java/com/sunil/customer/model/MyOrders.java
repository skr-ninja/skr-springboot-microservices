package com.sunil.customer.model;

import com.sunil.customer.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyOrders {
	
	private Product product;
	private Customer customer;

}
