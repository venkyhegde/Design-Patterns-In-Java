package io.github.venkyhegde.singleton.sync;

// Synchronized (Thread Safe). But poor in performance. Don't use :(
// synchronized is useful only when creating the first instance by multiple threads.
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
     * Only one thread get instance at time.
     * @return an instance of this class
     */
    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
