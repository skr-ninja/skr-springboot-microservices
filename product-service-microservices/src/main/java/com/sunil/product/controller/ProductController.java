package com.sunil.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.product.entity.Product;
import com.sunil.product.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/")
	public List<Product> getAllProduct() {

		return service.getAllProduct();
	}

	@PostMapping("/")
	public Product saveProduct(@RequestBody Product product) {

		return service.saveProduct(product);
	}

	@GetMapping("{id}")
	public Optional<Product> getProductById(@PathVariable("id") int pid) {

		return service.getProductById(pid);
	}

}
