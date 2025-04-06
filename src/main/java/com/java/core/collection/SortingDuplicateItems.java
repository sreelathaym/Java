package com.java.core.collection;
/*
Handling Duplicate Items in a Shopping Cart 🛒
When adding the same product multiple times to a shopping cart, there are different strategies to handle
 duplicates efficiently. Here are a few approaches:
 */

import java.util.HashMap;
import java.util.Map;

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }



}
class ShoppingCart {

        private Map<Product, Integer> cart = new HashMap<>();
        public void addProduct(Product product, int quantity) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        }
    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue() +
                    " - Total Price: $" + (entry.getKey().getPrice() * entry.getValue()));
        }
    }
}
public class SortingDuplicateItems {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new Product("Laptop", 1000.00);
        Product mouse = new Product("Mouse", 50.00);

        cart.addProduct(laptop, 1);
        cart.addProduct(mouse, 2);
        cart.addProduct(laptop, 1);  // Adding the same product again

        cart.displayCart();
    }

    }

