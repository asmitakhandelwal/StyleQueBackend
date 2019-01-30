package com.styleque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.styleque.dao.ProductDAO;
import com.styleque.model.Product;
import com.styleque.service.ProductService;

@Service(value="productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	public List<Product> getAllProducts() {
		List<Product> allProducts=productDAO.getAllProducts();
		if(allProducts!=null)
		{
			return allProducts;
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean addProduct(Product product) {
		if(productDAO.addProduct(product))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		if(productDAO.updateProduct(product))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public boolean deleteProduct(Product product) {
		if(productDAO.deleteProduct(product))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override 
	public Product getProductbyId(int productId) {
		Product product=productDAO.getProductbyId(productId);
		if(product!=null) {
			return product;		
		}
		else
		{
			return null;
		}
	}


@Override
public List<Product>getProductByName(String productName)
{
	List<Product> productList=productDAO.getProductByName("productName");
	if(productList!=null)
	{
		return productList;
	}
	else
	{
		return null;
	}
		
	}
}
