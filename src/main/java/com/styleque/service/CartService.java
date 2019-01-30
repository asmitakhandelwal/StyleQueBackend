package com.styleque.service;
import com.styleque.model.Cart;

public interface CartService 
{
   Cart getCartById(int cartId);
   void update(Cart cart);
}