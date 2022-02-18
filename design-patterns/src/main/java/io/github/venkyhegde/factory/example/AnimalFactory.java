package io.github.venkyhegde.factory.example;

public class AnimalFactory {

    /**
     * Factory method to return animals
     * @param name
     * @return
     */
    public static Animal getAnimal(String name)throws Exception{
        if(name == null)
            throw new Exception("Invalid Argument");

        if(name.equalsIgnoreCase("tiger"))
            return new Tiger();
        else if(name.equalsIgnoreCase("cat"))
            return new Cat();
        else if (name.equalsIgnoreCase("dog"))
            return new Dog();

        return null;
    }
}
