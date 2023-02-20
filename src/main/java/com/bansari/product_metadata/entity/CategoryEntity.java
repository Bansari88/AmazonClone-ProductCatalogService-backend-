package com.bansari.product_metadata.entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class CategoryEntity {

	@Id
	@GeneratedValue
	private BigInteger id;
	
	private String categoryId;
	private String categoryName;
	private String description;
}
