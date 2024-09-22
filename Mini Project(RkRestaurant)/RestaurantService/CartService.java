package com.evergent.CoreJava.RestaurantService;

import java.util.List;

import com.evergent.CoreJava.RestaurantBean.CartItem;
import com.evergent.CoreJava.RestaurantDao.CartDAO;

public class CartService {
    private CartDAO cartDAO = new CartDAO();

    // Method to add an item to the cart
    public void addToCart(int userId, int menuItemId, int quantity) {
        CartItem cartItem = new CartItem();
        cartItem.setUserId(userId);
        cartItem.setMenuItemId(menuItemId);
        cartItem.setQuantity(quantity);

        cartDAO.addToCart(cartItem);
    }

    // Method to view items in the cart
    public List<CartItem> viewCart(int userId) {
        return cartDAO.viewCart(userId);
    }

    // Method to remove an item from the cart
    public void removeFromCart(int cartItemId) {
        cartDAO.removeFromCart(cartItemId);
    }
}


