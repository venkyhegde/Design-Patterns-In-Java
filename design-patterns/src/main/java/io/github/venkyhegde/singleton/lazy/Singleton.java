package io.github.venkyhegde.singleton.lazy;

// Naive singleton (Lazy Evaluation) . not recommended :(
public class Singleton {
    // private static reference
    private static Singleton instance = null;

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
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
