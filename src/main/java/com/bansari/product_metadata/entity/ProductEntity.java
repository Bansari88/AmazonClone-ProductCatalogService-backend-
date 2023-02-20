package com.bansari.product_metadata.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class ProductEntity {

	@Id
	@GeneratedValue
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
