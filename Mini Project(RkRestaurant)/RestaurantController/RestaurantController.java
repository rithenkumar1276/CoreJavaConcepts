package com.evergent.CoreJava.RestaurantController;

import java.util.List;

import java.util.Scanner;

import com.evergent.CoreJava.RestaurantBean.*;
import com.evergent.CoreJava.RestaurantService.*;

public class RestaurantController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        MenuService menuService = new MenuService();
        CartService cartService = new CartService();
        TransactionService transactionService = new TransactionService();

        // Ask for user details only once
        System.out.println("-------------WElcome to RK Restaurant--------------");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int userId = scanner.nextInt();  // Using account number as user ID

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        // Create a new user
        userService.createUser(userId, name, initialBalance);

        int choice;
        do {
            System.out.println("\n1. View Menu");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Make Payment");
            System.out.println("6. View Transactions");
            System.out.println("7. Add Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<MenuItem> menuItems = menuService.getAllMenuItems();
                    System.out.println("Available Menu Items:");
                    for (MenuItem item : menuItems) {
                        System.out.printf("%d: %s (%s) - RS%.2f\n", item.getId(), item.getName(), item.getType(), item.getPrice());
                    }
                    break;

                case 2:
                    System.out.print("Enter Menu Item ID to add to cart: ");
                    int itemId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cartService.addToCart(userId, itemId, quantity);
                    System.out.println("Item added to cart!");
                    break;

                case 3:
                    List<CartItem> cartItems = cartService.viewCart(userId);
                    System.out.println("Your Cart:");
                    for (CartItem cartItem : cartItems) {
                        System.out.printf("Item ID: %d, Quantity: %d\n", cartItem.getMenuItemId(), cartItem.getQuantity());
                    }
                    break;

                case 4:
                    System.out.print("Enter Cart Item ID to remove: ");
                    int cartItemId = scanner.nextInt();
                    cartService.removeFromCart(cartItemId);
                    System.out.println("Item removed from cart!");
                    break;

                case 5:
                    double total = 0;
                    for (CartItem cartItem : cartService.viewCart(userId)) {
                        // Fetch menu item details for total calculation
                        MenuItem menuItem = menuService.getAllMenuItems().stream().filter(item -> item.getId() == cartItem.getMenuItemId()).findFirst().orElse(null);
                        if (menuItem != null) {
                            total += menuItem.getPrice() * cartItem.getQuantity();
                        }
                    }
                    System.out.println("Total Amount: RS" + total);
                    System.out.print("Enter amount to pay: ");
                    double amountPaid = scanner.nextDouble();

                    if (amountPaid >= total) {
                        userService.addBalance(userId, -total);  // Deduct total from user balance
                        transactionService.createTransaction(userId, total, "Payment for order");
                        System.out.println("Payment successful! Invoice has been generated.");
                        System.out.printf("Invoice: \nName: %s\nAccount Number: %d\nTotal Amount: RS%.2f\n", name, userId, total);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;

                case 6:
                    List<Transaction> transactions = transactionService.getTransactionHistory(userId);
                    System.out.println("Your Transactions:");
                    for (Transaction transaction : transactions) {
                        System.out.println("ID: "+transaction.getId()+"\n"+"Amount: "+transaction.getAmount()+"\n"+"Description: "+"\n"+ transaction.getDescription()+"\n"+"Date :"+transaction.getDate());
                    }
                    break;

                case 7:
                    System.out.print("Enter amount to add to balance: ");
                    double addAmount = scanner.nextDouble();
                    userService.addBalance(userId, addAmount);
                    System.out.println("Balance added successfully!");
                    break;

                case 0:
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
