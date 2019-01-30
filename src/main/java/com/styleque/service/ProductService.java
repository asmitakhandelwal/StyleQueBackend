package com.styleque.service;

import java.util.List;

import com.styleque.model.Product;
public interface ProductService{

	List<Product> getAllProducts();
	boolean addProduct(Product product);
	Product getProductbyId(int productId);
	List<Product>getProductByName(String productName);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
}