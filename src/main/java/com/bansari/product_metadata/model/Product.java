package com.bansari.product_metadata.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.bansari.product_metadata.entity.ReviewEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	private BigInteger id;

	private String productId;
	private String productName;
	private String description;
	private String category;
	private BigDecimal price;
	private boolean availability;
	private Map<String, String> productAttributes;
	private List<String> productImages;
	private List<ReviewEntity> reviewEntities;
}
