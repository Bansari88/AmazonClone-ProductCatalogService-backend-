package com.bansari.product_metadata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bansari.product_metadata.entity.ProductImageEntity;
import com.bansari.product_metadata.model.Product;
import com.bansari.product_metadata.repository.ProductImageRepository;
import com.bansari.product_metadata.service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/amazon/v1")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductImageRepository repository;

	@PostMapping("/saveProduct")
	public Product saveDataToDB(@RequestBody Product product) {
		return productService.save(product);
	}

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}

	@GetMapping("/getAllProductImages")
	public List<ProductImageEntity> getAllProductImages() {
		return repository.findAll();
	}

	@PostMapping("/saveProductImages")
	public ProductImageEntity saveProductImagesToDB(@RequestBody ProductImageEntity product) {
		return repository.save(product);
	}

}
