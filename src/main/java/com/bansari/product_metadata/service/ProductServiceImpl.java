package com.bansari.product_metadata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bansari.product_metadata.entity.ProductEntity;
import com.bansari.product_metadata.model.Product;
import com.bansari.product_metadata.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllProducts() {
		List<ProductEntity> productEntities = productRepository.findAll();
		List<Product> products = new ArrayList<>();
		for (ProductEntity productEntity : productEntities) {
			Product product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			products.add(product);
		}
		return products;
	}

	@Override
	public Product save(Product product) {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		ProductEntity savedProductEntity = productRepository.save(productEntity);
		BeanUtils.copyProperties(savedProductEntity, product);
		return product;
	}
}
