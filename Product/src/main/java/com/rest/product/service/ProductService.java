package com.rest.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.product.entity.Product;
import com.rest.product.repositery.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo service;
	public List<Product> getProducts(){
		List<Product> list=new ArrayList<>();
		this.service.findAll().forEach(list::add);
		return list;
		
	}
	public void addProduct(Product c) {
		this.service.save(c);
		
	}
	public void updateProduct( Integer id,Product c) {
		this.service.save(c);
	}
	public void delProduct(Integer id) {
		this.service.deleteById(id);
	}


}
