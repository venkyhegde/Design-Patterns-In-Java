package io.github.venkyhegde.command.stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // create the receiver object
        Stock stock1 = new Stock("Google", 10);
        Stock stock2 = new Stock("Tesla", 6);
        Stock stock3 = new Stock("GE", 61);
        Stock stock4 = new Stock("Ford", 111);

        // associate with command
        CommandOrder stock1Buy = new BuyStock(stock1);
        CommandOrder stock1Sell = new SellStock(stock1);

        CommandOrder stock2Buy = new BuyStock(stock2);

        CommandOrder stock3Sell = new SellStock(stock3);

        CommandOrder stock4Buy = new BuyStock(stock4);
        CommandOrder stock4Sell = new SellStock(stock4);

        List<CommandOrder> commandOrderList = new ArrayList<>();
        commandOrderList.add(stock1Buy);
        commandOrderList.add(stock1Sell);
        commandOrderList.add(stock2Buy);
        commandOrderList.add(stock3Sell);
        commandOrderList.add(stock4Buy);
        commandOrderList.add(stock4Sell);

        // create invoker and invoke methods
        Broker broker = new Broker();
        broker.takeOrder(commandOrderList);
        broker.placeOrder();



    }
}
