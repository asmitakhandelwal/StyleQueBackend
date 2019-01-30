package com.styleque.dao;
import java.util.List;

import com.styleque.model.Product;
public interface ProductDAO {
	

		List<Product> getAllProducts();
		boolean addProduct(Product product);
		List<Product>getProductByName(String productName);
		Product getProductbyId(int productId);
		boolean updateProduct(Product product);
		boolean deleteProduct(Product product);
	}


