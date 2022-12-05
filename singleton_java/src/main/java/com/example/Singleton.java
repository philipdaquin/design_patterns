
package com.example;

public final class Singleton {

    /**
     * The field must be declared volatle so that double check lock woud work correclty 
     */
    private static volatile Singleton instance;

    public String value;

    public Singleton(String value) { 
        this.value = value;
    }
    
    public static Singleton getInstance(String value) { 
        Singleton res = instance;

        /**
         * If there is a current instance of Singleton then simple return it else 
         * we need to create a new instance of Singleton from the value 
         */
        if (res != null) return res;
        synchronized(Singleton.class) { 
            if (instance == null) instance = new Singleton(value);
            return instance;
        }
    }
}
