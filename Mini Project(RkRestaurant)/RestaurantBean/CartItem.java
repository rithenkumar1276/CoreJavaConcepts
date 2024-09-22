package com.evergent.CoreJava.RestaurantBean;

public class CartItem {
    private int id;         // Unique ID for the cart item
    private int userId;     // ID of the user associated with the cart
    private int menuItemId; // ID of the menu item
    private int quantity;    // Quantity of the menu item

    // Constructor
    public CartItem() {}

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and Setter for menuItemId
    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
