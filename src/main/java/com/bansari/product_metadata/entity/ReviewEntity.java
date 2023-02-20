package com.bansari.product_metadata.entity;



import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class ReviewEntity {

	private String userId;
	private String rating;
	private String comment;
}
