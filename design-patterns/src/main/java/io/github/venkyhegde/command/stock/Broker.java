package io.github.venkyhegde.command.stock;

import java.util.List;

// this is the invoker class
public class Broker {
    // invoker encapsulates the command

    List<CommandOrder> orderList;
   public void takeOrder(List<CommandOrder> orderList){
       this.orderList = orderList;
    }

    public void placeOrder(){
       for (CommandOrder order:orderList){
           order.execute();
       }
    }
}
