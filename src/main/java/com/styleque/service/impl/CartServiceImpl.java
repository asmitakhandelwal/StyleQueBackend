package com.styleque.service.impl;

import com.styleque.dao.CartDAO;
import com.styleque.model.Cart;
import com.styleque.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDAO cartDAO;

    public Cart getCartById(int cartId){
        return cartDAO.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDAO.update(cart);
    }
} 