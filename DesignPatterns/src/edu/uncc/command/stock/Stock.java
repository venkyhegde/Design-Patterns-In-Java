package edu.uncc.command.stock;

// Receiver
public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    // operations
    public void buy(){
        System.out.println("Buying "+quantity+" "+name+" stocks");
    }

    public void sell(){
        System.out.println("Selling "+quantity+" "+name+" stocks");
    }
}
