package com.styleque.service;
import com.styleque.model.Cart;
import com.styleque.model.CartItem;

public interface CartItemService 
{
    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
