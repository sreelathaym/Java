package com.java.core.thread;

public class ActiveCount {
    public static void main(String[] args) {
        System.out.println("main Thread:"+Thread.activeCount());
        Thread t = new Thread ();
        t.start();
        System.out.println("After Tread Starts:"+Thread.activeCount());
        Thread t1= new Thread ();
        t1.start();
        System.out.println("After adding Second thread:"+Thread.activeCount());
//        Thread t2 = new Thread ();
//        t2.start();
//        System.out.println(Thread.activeCount());
        //>=4 only completed thread count replace with
        Thread t3 = new Thread ();
        t3.start();
        System.out.println("After third thread:"+Thread.activeCount());

    }
}
