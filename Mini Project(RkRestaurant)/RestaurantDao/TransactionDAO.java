package com.evergent.CoreJava.RestaurantDao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.evergent.CoreJava.RestaurantBean.Transaction;
public class TransactionDAO {
    public void createTransaction(int userId, double amount, String description) {
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "INSERT INTO transactions (user_id, amount, description) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, userId);
            pstmt.setDouble(2, amount);
            pstmt.setString(3, description);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> getTransactionHistory(int userId) {
        List<Transaction> transactions = new ArrayList<>();
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "SELECT * FROM transactions WHERE user_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Transaction transaction = new Transaction();
                transaction.setId(rs.getInt("id"));
                transaction.setUserId(rs.getInt("user_id"));
                transaction.setAmount(rs.getDouble("amount"));
                transaction.setDescription(rs.getString("description"));
                transactions.add(transaction);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactions;
    }
}