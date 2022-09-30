package com.rest.product.repositery;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.rest.product.entity.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
