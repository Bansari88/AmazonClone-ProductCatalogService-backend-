package com.bansari.product_metadata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bansari.product_metadata.model.Brand;
import com.bansari.product_metadata.service.BrandService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/amazon/v1")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@PostMapping("/saveBrand")
	public Brand saveDataToDB(@RequestBody Brand brand) {
		return brandService.save(brand);
	}

	@GetMapping("/getAllBrands")
	public List<Brand> getAllBrands() {
		return brandService.findAllBrands();
	}
}
