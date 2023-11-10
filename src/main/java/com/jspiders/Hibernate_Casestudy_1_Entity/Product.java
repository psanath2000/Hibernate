package com.jspiders.Hibernate_Casestudy_1_Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private String ProductId;
	private String ProductName;
	private String ProductPrice;
	private String ProductQuantity;
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		ProductQuantity = productQuantity;
	}
	//	@Override
	//	public String toString() {
	//		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
	//				+ ", ProductQuantity=" + ProductQuantity + "]";
	//	}
}
