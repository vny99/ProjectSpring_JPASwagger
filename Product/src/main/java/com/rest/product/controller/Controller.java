package com.rest.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.product.entity.Product;
import com.rest.product.service.ProductService;

@RestController
@RequestMapping("/rest")
public class Controller {
	@Autowired
	private ProductService ps;
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product p) {
		 this.ps.addProduct(p);
		}
	@GetMapping("/showproducts")
	public List<Product> showProducts(){
		return this.ps.getProducts();
	}
	@PutMapping("deleteproduct/{prodId}")
	public void delProduct(@PathVariable String prodId) {
		 this.ps.delProduct(Integer.parseInt(prodId));
	}
	@PutMapping("updateproduct/{prodId}")
	public void updateProduct (@RequestBody Product p,@PathVariable String prodId) {
		this.ps.updateProduct(Integer.parseInt(prodId),p);
	
	
	}
	
}