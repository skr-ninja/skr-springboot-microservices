package com.sunil.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunil.product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
