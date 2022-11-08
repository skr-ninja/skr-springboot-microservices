package com.sunil.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.product.entity.Product;
import com.sunil.product.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

	public List<Product> getAllProduct() {

		return repo.findAll();
	}

	public Optional<Product> getProductById(int pid) {

		return repo.findById(pid);
	}

	public Product saveProduct(Product product) {

		return repo.save(product);
	}

}
