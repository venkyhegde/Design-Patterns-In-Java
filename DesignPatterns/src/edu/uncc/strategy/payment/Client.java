package edu.uncc.strategy.payment;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product(1234,134.12);
        Product p2 = new Product(2353,330.25);

        cart.addProductToCart(p1);
        cart.addProductToCart(p2);

        // paying through cc
        cart.pay(new CreditCardStrategy("Venky Hegde", "1541456334538734","123","12/23"));

        // pay through pay pal
        cart.pay(new PayPalStrategy("test123@email.com", "12345"));

    }
}
