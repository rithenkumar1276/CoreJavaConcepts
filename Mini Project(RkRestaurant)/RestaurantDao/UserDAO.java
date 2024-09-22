package com.evergent.CoreJava.RestaurantDao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.evergent.CoreJava.RestaurantBean.*;

public class UserDAO {
	public void saveUser(User user) {
	    try (Connection con = RestaurantDBConnection.getConnection()) {
	        String query = "INSERT INTO users (id, name, balance) VALUES (?, ?, ?)";
	        PreparedStatement pstmt = con.prepareStatement(query);
	        pstmt.setInt(1, user.getId());
	        pstmt.setString(2, user.getName());
	        pstmt.setDouble(3, user.getBalance());
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

    // Method to add balance
    public void addBalance(int userId, double amount) {
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "UPDATE users SET balance = balance + ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, userId);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double getBalance(int userId) {
        double balance = 0;
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "SELECT balance FROM users WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                balance = rs.getDouble("balance");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }

    // Other user-related methods...
}
