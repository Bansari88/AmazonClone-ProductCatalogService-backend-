package com.bansari.product_metadata.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bansari.product_metadata.entity.BrandEntity;

@Repository
public interface BrandRepository extends MongoRepository<BrandEntity, BigInteger>  {

}
