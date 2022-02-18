package io.github.venkyhegde.singleton.eager;

// Eager Evaluation instance created during class loading by JVM. It's Thread safe.
public class Singleton {
    // private static reference
    private static Singleton instance = new Singleton();

    /**
     * Private constructor
     */
    private Singleton(){
    }

    /**
     * This public method ensures there only one object
     * @return an instance of this class
     */
    public static Singleton getInstance(){
        return instance;
    }

}
