package edu.uncc.strategy.payment;

public class Product {
    private int productCode;
    private double price;

    public Product(int productCode, double price) {
        this.productCode = productCode;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }
}
