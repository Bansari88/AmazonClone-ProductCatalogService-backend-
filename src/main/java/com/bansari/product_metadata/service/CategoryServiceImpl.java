package com.bansari.product_metadata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bansari.product_metadata.entity.CategoryEntity;
import com.bansari.product_metadata.model.Category;
import com.bansari.product_metadata.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> findAllCategories() {
		List<CategoryEntity> categoryEntities = categoryRepository.findAll();
		List<Category> categories = new ArrayList<>();
		for (CategoryEntity categoryEntity : categoryEntities) {
			Category category = new Category();
			BeanUtils.copyProperties(categoryEntity, category);
			categories.add(category);
		}
		return categories;
	}

	@Override
	public Category save(Category category) {
		CategoryEntity categoryEntity = new CategoryEntity();
		BeanUtils.copyProperties(category, categoryEntity);
		CategoryEntity savedCategoryEntity = categoryRepository.save(categoryEntity);
		BeanUtils.copyProperties(savedCategoryEntity, category);
		return category;
	}
}
