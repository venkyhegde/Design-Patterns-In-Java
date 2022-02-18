package io.github.venkyhegde.singleton.locking;

// Double checked Lock (locking principle). Synchronized (Thread Safe).
// In this approach, checking if instance is created or not, if not then Synchronized, which improves performance.
public class Singleton {
    // private static reference
    private volatile static Singleton instance = null;

    /**
     * Private constructor
     */
    private Singleton(){
    }

    /**
     * This public method ensures there only one object
     * synchronized only once
     * @return an instance of this class
     */
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
