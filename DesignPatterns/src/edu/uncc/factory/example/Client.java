package edu.uncc.factory.example;

public class Client {
    public static void main(String[] args) {
        Animal animal1 = null;
        Animal animal2 = null;
        try {
             animal1 = AnimalFactory.getAnimal("dog");
             animal2 = AnimalFactory.getAnimal("cat");
        } catch (Exception e) {
            e.printStackTrace();
        }

        animal1.getName();
        animal2.getName();
    }
}
