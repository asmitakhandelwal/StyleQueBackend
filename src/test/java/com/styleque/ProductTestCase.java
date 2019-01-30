package com.styleque;
import org.junit.After;

import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.styleque.model.Product;
import com.styleque.service.ProductService;

public class ProductTestCase {

	ProductService productService;
	AnnotationConfigApplicationContext context;
	Product product;
	@Before
	public void setUp()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.styleque");
		context.refresh();
		product = (Product)context.getBean("product");
		productService=(ProductService)context.getBean("productService");
	}
	
	@Test
	public void addProduct()
	{
		boolean result;
		product.setPrice(2000);
		product.setProductName("school shoes");
		product.setCategory("Shoes");
		product.setQuantity(20);
		product.setDescription("this is a school shoe");
		//product.setImage("viewmoreimage2");
		result=productService.addProduct(product);
		if(result)
		{
			System.out.println("Product Added");
		}
		else
		{
			System.out.println("Error in adding Product");
		}
	}
	@Test
	public void updateProduct()
	{
		boolean result;
		product.setProductId(2);
		product.setPrice(15000);
		product.setProductName("School bag");
		product.setCategory("Bag");
		product.setQuantity(6);
		product.setDescription("this is a school bag");
	//	product.setImage("viewmoreimage1");
		result=productService.addProduct(product);
		if(result)
		{
			System.out.println("Product Added");
		}
		else
		{
			System.out.println("Error in adding Product");
		}
	}
     /*result=productService.updateProduct(product);
     if(result) {
    	 System.out.println("Product updated");
    	 
     }
     else {
    	 System.out.println("not updated");
     }*/
	
	
	@Ignore
	@Test
	public void getProductbyId()
	{
		product=productService.getProductbyId(2);
		System.out.println("Product Name: "+product.getProductName()+"  "+product.getPrice());
	}

	
	@Ignore
	@Test
	public void deleteProduct()
	{
		boolean result;
		product.setProductId(1);
		result=productService.deleteProduct(product);
		if(result)
		{
			System.out.println("Product deleted");
		}
		else
		{
			System.out.println("Product not deleted");
		}
	}
	@After
	public void tearDown()
	{
		context.close();
	}
}