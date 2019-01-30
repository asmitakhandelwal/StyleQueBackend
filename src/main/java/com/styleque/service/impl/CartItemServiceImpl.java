package com.styleque.service.impl;

import com.styleque.dao.CartItemDAO;
import com.styleque.model.Cart;
import com.styleque.model.CartItem;
import com.styleque.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDAO cartItemDAO;

    public void addCartItem(CartItem cartItem){
        cartItemDAO.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDAO.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDAO.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId){
        return cartItemDAO.getCartItemByProductId(productId);
    }

} 