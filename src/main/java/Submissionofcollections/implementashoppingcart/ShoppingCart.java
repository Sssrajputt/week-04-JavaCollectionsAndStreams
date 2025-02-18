package Submissionofcollections.implementashoppingcart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> hashMapPrices = new HashMap<>();
    private Map<String, Double> linkedHashMapCart = new LinkedHashMap<>();
    private Map<String, Double> treeMapCart = new TreeMap<>(Comparator.comparingDouble(hashMapPrices::get));

    // Method to add a product with its price
    public void addProduct(String product, double price) {
        hashMapPrices.put(product, price);
    }

    // Method to add a product to the cart
    public void addToCart(String product) {
        if (hashMapPrices.containsKey(product)) {
            double price = hashMapPrices.get(product);

            // Add to LinkedHashMap to maintain order of items added
            linkedHashMapCart.put(product, price);

            // Add to TreeMap to display items sorted by price
            treeMapCart.put(product, price);
        } else {
            System.out.println("Product not found in the store.");
        }
    }

    // Method to display cart items in the order they were added
    public void displayCartByOrder() {
        System.out.println("Cart Items in Order of Addition:");
        for (Map.Entry<String, Double> entry : linkedHashMapCart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }

    // Method to display cart items sorted by price
    public void displayCartByPrice() {
        System.out.println("Cart Items Sorted by Price:");
        for (Map.Entry<String, Double> entry : treeMapCart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }

    // Method to retrieve the price of a specific product
    public double getProductPrice(String product) {
        return hashMapPrices.getOrDefault(product, 0.0);
    }
}
