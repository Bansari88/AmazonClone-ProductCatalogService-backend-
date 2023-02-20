package com.bansari.product_metadata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bansari.product_metadata.model.Brand;

@Service
public interface BrandService {

	public List<Brand> findAllBrands();

	public Brand save(Brand brand);
}
