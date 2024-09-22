package com.evergent.CoreJava.RestaurantService;

import java.util.List;
import com.evergent.CoreJava.RestaurantBean.*;
import com.evergent.CoreJava.RestaurantDao.*;

public class UserService {
    UserDAO userDAO = new UserDAO();
    
    public void createUser(int userId, String name, double initialBalance) {
        User user = new User();
        user.setId(userId);
        user.setName(name);
        user.setBalance(initialBalance);
        // Assuming you have a method to save the user to the database
        userDAO.saveUser(user);
    }


    public void addBalance(int userId, double amount) {
        userDAO.addBalance(userId, amount);
    }

    public double getBalance(int userId) {
        return userDAO.getBalance(userId);
    }
}
