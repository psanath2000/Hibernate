package com.jspiders.Hibernate_Casestudy_1_Entity;

import java.util.List;

public class Cart {
	private int cartid;
	private List<Product> productls;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public List<Product> getProductls() {
		return productls;
	}
	public void setProductls(List<Product> productls) {
		this.productls = productls;
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", productls=" + productls + "]";
	}
}
