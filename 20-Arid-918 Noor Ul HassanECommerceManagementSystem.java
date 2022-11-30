/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.srscode;

/**
 *
 * @author Noor
 */
import java.util.*;

abstract class Product {
    protected int productID;
    protected String productName;
    protected double price;
    
    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    
    public int getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product ID: " + productID + "\nProduct Name: " + productName + "\nPrice: " + price;
    }
    
    public abstract void addProduct();
    public abstract void deleteProduct();
    public abstract void updateProduct();
    public abstract Product searchProduct();
}

class Inventory extends Product {
    private int quantity;
    
    public Inventory(int productID, String productName, double price, int quantity) {
        super(productID, productName, price);
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nQuantity: " + quantity;
    }
    
    @Override
    public void addProduct() {
        // code to add a product to inventory
    }
    
    @Override
    public void deleteProduct() {
        // code to delete a product from inventory
    }
    
    @Override
    public void updateProduct() {
        // code to update a product in inventory
    }
    
    @Override
    public Product searchProduct() {
        // code to search a product in inventory
        return null;
    }
}

class Order extends Product {
    private Date orderDate;
    private int quantity;
    
    public Order(int productID, String productName, double price, Date orderDate, int quantity) {
        super(productID, productName, price);
        this.orderDate = orderDate;
        this.quantity = quantity;
    }
    
    public Date getOrderDate() {
        return orderDate;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return super.toString() + "\nOrder Date: " + orderDate + "\nQuantity: " + quantity;
    }
    
    public void addProduct() {
        // code to add a product to order
    }
    
    public void deleteProduct() {
        // code to delete a product from order
    }
    
    public void updateProduct() {
        // code to update a product in order
    }
    
    @Override
    public Product searchProduct() {
        // code to search a product in order
        return null;
    }
}

public class ECommerceManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n****** E-Commerce Management System ******\n");
            System.out.println("1. Inventory");
            System.out.println("2. Order");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    Inventory inventory = new Inventory(1, "iPhone", 999.99, 10);
                    System.out.println(inventory);
                    break;
                    
                case 2:
                    Order order = new Order(2, "MacBook", 1999.99, new Date(), 5);
                    System.out.println(order);
                    break;
                    
                case 3:
                    System.out.println("\nThank you for using our system. Goodbye!");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        } while(choice != 3);
    }
}
