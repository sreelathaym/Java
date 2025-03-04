package com.java.core.oops.singleton;

import java.util.Arrays;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        System.out.println("Singleton instance created");
    }

    public static ThreadSafeSingleton getInstance(){
        if(instance  == null){
            synchronized (ThreadSafeSingleton.class){
                if ( instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
class Test{
    public static void main(String[] args) {
        Runnable task=()->{
            ThreadSafeSingleton obj1= ThreadSafeSingleton.getInstance();
            System.out.println(obj1);

        };
        Runnable task1=()->{
            ThreadSafeSingleton obj1= ThreadSafeSingleton.getInstance();
            System.out.println(obj1);

        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task1);
        t1.start();
        t2.start();

    }
}
