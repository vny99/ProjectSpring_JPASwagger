package com.rest.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private String prodCat;
	private long prodPrice;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCat() {
		return prodCat;
	}
	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public long getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(long prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Product(int prodId, String prodName, String prodCat, long prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCat = prodCat;
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCat=" + prodCat + ", prodPrice="
				+ prodPrice + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
