package com.java.core.thread;

public class ActiveCount {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        Thread t = new Thread ();
        t.start();
        System.out.println(Thread.activeCount());
        Thread t1= new Thread ();
        t1.start();
        System.out.println(Thread.activeCount());
//        Thread t2 = new Thread ();
//        t2.start();
//        System.out.println(Thread.activeCount());
        //>=4 only completed thread count replace with
        Thread t3 = new Thread ();
        t3.start();
        System.out.println(Thread.activeCount());

    }
}
