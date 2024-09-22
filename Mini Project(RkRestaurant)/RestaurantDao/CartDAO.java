package com.evergent.CoreJava.RestaurantDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.evergent.CoreJava.RestaurantBean.CartItem;

public class CartDAO {
    // Method to add an item to the cart
    public void addToCart(CartItem cartItem) {
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "INSERT INTO cart (user_id, menu_item_id, quantity) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, cartItem.getUserId());
            pstmt.setInt(2, cartItem.getMenuItemId());
            pstmt.setInt(3, cartItem.getQuantity());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to view items in the cart for a user
    public List<CartItem> viewCart(int userId) {
        List<CartItem> cartItems = new ArrayList<>();
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "SELECT id, menu_item_id, quantity FROM cart WHERE user_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CartItem cartItem = new CartItem();
                cartItem.setId(rs.getInt("id"));
                cartItem.setMenuItemId(rs.getInt("menu_item_id"));
                cartItem.setQuantity(rs.getInt("quantity"));
                cartItem.setUserId(userId); // Set userId for reference
                cartItems.add(cartItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartItems;
    }

    // Method to remove an item from the cart
    public void removeFromCart(int cartItemId) {
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "DELETE FROM cart WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, cartItemId);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
