package com.styleque.dao.impl;
import java.util.ArrayList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.styleque.dao.ProductDAO;
import com.styleque.model.Product;
@Repository(value="productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Product> getAllProducts() {
		List<Product> allProducts=new ArrayList<>();
		try
		{
			allProducts=sessionFactory.getCurrentSession().createQuery("from Product").list();
			return allProducts;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	@Override
	public List<Product> getProductByName(String productName){

		Session session=sessionFactory.getCurrentSession();
		Criteria criteria =session.createCriteria(Product.class);
		criteria.add((Restrictions.eqOrIsNull("productName", productName)));
		List<Product> allProductByName=criteria.list();
		return allProductByName;
		}

	
  @Override
  public boolean updateProduct(Product product) {
	try
	{
		sessionFactory.getCurrentSession().update(product);
		return true;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		return false;
	}
  }
  
  @Override
  public boolean deleteProduct(Product product) {
	try
	{
		sessionFactory.getCurrentSession().delete(product);
		return true;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		return false;
	}
  }
  
  @Override
 public Product getProductbyId(int productId) 
{
	Session session=sessionFactory.getCurrentSession();
	Product product=session.get(Product.class,productId);
	return product;
}
	
}


