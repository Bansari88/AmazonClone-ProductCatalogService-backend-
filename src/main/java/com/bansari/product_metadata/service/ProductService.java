package com.bansari.product_metadata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bansari.product_metadata.model.Product;

@Service
public interface ProductService {

	public List<Product> findAllProducts();

	public Product save(Product product);

	
}
