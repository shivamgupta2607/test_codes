package com.session.designpatterns.singleton;

public class SynchronisedSingleton {
private static SynchronisedSingleton obj;
	 
	    private SynchronisedSingleton() {}
	 
	    // Only one thread can execute this at a time
	    public static synchronized SynchronisedSingleton getInstance()
	    {
	        if (obj==null)
	            obj = new SynchronisedSingleton();
	        return obj;
	    }

}
