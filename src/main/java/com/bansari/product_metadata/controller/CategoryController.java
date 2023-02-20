package com.bansari.product_metadata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bansari.product_metadata.model.Category;
import com.bansari.product_metadata.service.CategoryService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/amazon/v1")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/saveCategory")
	public Category saveDataToDB(@RequestBody Category category) {
		return categoryService.save(category);
	}

	@GetMapping("/getAllCategories")
	public List<Category> getAllCategories() {
		return categoryService.findAllCategories();
	}
}
