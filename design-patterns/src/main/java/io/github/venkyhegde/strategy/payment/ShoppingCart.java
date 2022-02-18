package io.github.venkyhegde.strategy.payment;

import java.util.ArrayList;
import java.util.List;

// this is the context which will call the appropriate payment strategy
public class ShoppingCart {
    List<Product> products;
    double totalPrice;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        totalPrice = 0;
    }

    public void addProductToCart(Product product){
        products.add(product);
        totalPrice += product.getPrice();
    }

    public void removeProductFromCart(Product product){
        products.remove(product);
        totalPrice -= product.getPrice();
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(totalPrice);
    }
}
