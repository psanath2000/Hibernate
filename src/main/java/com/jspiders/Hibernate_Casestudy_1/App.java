package com.jspiders.Hibernate_Casestudy_1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.Hibernate_Casestudy_1_ProductService.*;
import com.jspiders.Hibernate_Casestudy_1_Dao.*;


public class App {
	public static void main( String[] args ){
		

		ApplicationContext context= new ClassPathXmlApplicationContext("sanath.xml");
		ProductService bean = context.getBean(ProductService.class);	
		
		
		ProductService productservice = new ProductService();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Enter 1 to save data\n"
				+ "2.Enter 2 to get All products\n"
				+ "3.Enter 3 to get product by id ID\n"
				+ "4.Enter 4 to update product\n"
				+ "5.Enter 5 to delete product");
		int choice = sc.nextInt();

		switch(choice)
		{
		case 1:productservice.addProduct();
		break;

		case 2:productservice.getallproducts();
		break;

		case 3: productservice.getproductbyId();
		break;

		case 4: productservice.updateproduct();
		break;

		case 5: productservice.deleteproduct();
		break;

		}
	}
}
