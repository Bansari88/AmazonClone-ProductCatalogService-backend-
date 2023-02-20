package com.bansari.product_metadata.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bansari.product_metadata.entity.ProductEntity;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, BigInteger> {

	List<ProductEntity> findAll();
}
