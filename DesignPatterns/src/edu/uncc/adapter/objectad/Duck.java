package edu.uncc.adapter.objectad;

public interface Duck {
    void quack();
    void fly();
}

 class MallardDuck implements Duck{

     @Override
     public void quack() {
         System.out.println("Quack..");
     }

     @Override
     public void fly() {
         System.out.println("Flying..");
     }
 }
