package com.bansari.product_metadata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bansari.product_metadata.entity.BrandEntity;
import com.bansari.product_metadata.model.Brand;
import com.bansari.product_metadata.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Brand> findAllBrands() {
		List<BrandEntity> brandEntities = brandRepository.findAll();
		List<Brand> brands = new ArrayList<>();
		for (BrandEntity brandEntity : brandEntities) {
			Brand brand = new Brand();
			BeanUtils.copyProperties(brandEntity, brand);
			brands.add(brand);
		}
		return brands;
	}

	@Override
	public Brand save(Brand brand) {
		BrandEntity brandEntity = new BrandEntity();
		BeanUtils.copyProperties(brand, brandEntity);
		BrandEntity savedBrandEntity = brandRepository.save(brandEntity);
		BeanUtils.copyProperties(savedBrandEntity, brand);
		return brand;
	}

}
