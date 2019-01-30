package com.styleque.dao;

import com.styleque.model.Cart;
import com.styleque.model.CartItem;

public interface CartItemDAO {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
