package com.session.designpatterns.singleton;

public class EagerSingleton {

    private static EagerSingleton obj = new EagerSingleton();
 
    private EagerSingleton() {}
 
    public static EagerSingleton getInstance()
    {
        return obj;
    }
}	