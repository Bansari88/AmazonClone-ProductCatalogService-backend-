package com.bansari.product_metadata.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {

	private String userId;
	private String rating;
	private String comment;
}
