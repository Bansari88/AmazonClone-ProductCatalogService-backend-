package com.bansari.product_metadata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bansari.product_metadata.model.Category;

@Service
public interface CategoryService {

	public List<Category> findAllCategories();

	public Category save(Category category);
}
