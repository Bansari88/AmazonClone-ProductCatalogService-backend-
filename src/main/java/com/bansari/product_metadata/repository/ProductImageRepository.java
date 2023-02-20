package com.bansari.product_metadata.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bansari.product_metadata.entity.ProductImageEntity;

@Repository
public interface ProductImageRepository extends MongoRepository<ProductImageEntity, BigInteger> {

	ProductImageEntity save(byte[] bytes);

}
