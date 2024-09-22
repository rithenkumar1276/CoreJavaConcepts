package com.evergent.CoreJava.RestaurantService;

import java.util.List;

import com.evergent.CoreJava.RestaurantBean.*;
import com.evergent.CoreJava.RestaurantDao.*;


public class TransactionService {
    TransactionDAO transactionDAO = new TransactionDAO();

    public void createTransaction(int userId, double amount, String description) {
        transactionDAO.createTransaction(userId, amount, description);
    }

    public List<Transaction> getTransactionHistory(int userId) {
        return transactionDAO.getTransactionHistory(userId);
    }
}
