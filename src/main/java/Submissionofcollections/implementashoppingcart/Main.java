package Submissionofcollections.implementashoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add products to the store
        shoppingCart.addProduct("Apple", 1.0);
        shoppingCart.addProduct("Banana", 0.5);
        shoppingCart.addProduct("Orange", 1.2);
        shoppingCart.addProduct("Grapes", 2.5);

        // Add products to the cart
        shoppingCart.addToCart("Apple");
        shoppingCart.addToCart("Banana");
        shoppingCart.addToCart("Grapes");

        // Display cart items in the order they were added
        shoppingCart.displayCartByOrder();

        // Display cart items sorted by price
        shoppingCart.displayCartByPrice();

        // Retrieve the price of a specific product
        System.out.println("Price of Orange: " + shoppingCart.getProductPrice("Orange"));
    }
}
