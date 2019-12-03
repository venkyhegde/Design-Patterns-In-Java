package edu.uncc.singleton.billpugh;

// Thread safe, standard & optimal approach
public class Singleton {

    /**
     * Private constructor
     */
    private Singleton(){
    }

    private static class Helper{
        private static final Singleton instance = new Singleton();
    }

    /**
     * This public method to get this class instance
     * @return an instance of this class
     */
    public static Singleton getInstance(){
        return Helper.instance;
    }
}
