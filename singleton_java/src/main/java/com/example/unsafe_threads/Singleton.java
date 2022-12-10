package com.example.unsafe_threads;

public final class Singleton {
    private static Singleton instance;
    public String value;



    private Singleton(String value) { 
        // Slow initialisation 

        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
    }

    /**
     * Lazy Initialization 
        * This method will check if there is any instanc of that class is already created?
        * If yes, then our method will return that old instance and if not then it create a new instance 
        * with a delay of 2000 ms 
     * @param value
     * @return
     */
    public static Singleton getInstance(String value) { 
        if (instance == null) { 
            instance = new Singleton(value);
        }
        return instance;
    } 
    
}
