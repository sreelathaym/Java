package com.java.core.thread;

import java.lang.Thread;
class HelloThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("HelloTread--"+i);
        }
    }
}

public class ThreadConstructor1 {
    public static void main(String[] args) {

        java.lang.Thread t3 = new java.lang.Thread();
        System.out.println(t3);

        java.lang.Thread t1 = new java.lang.Thread("core java");
        System.out.println(t1);

        Runnable r = new java.lang.Thread();
        System.out.println(r);
        java.lang.Thread t2 =new java.lang.Thread(r);
        System.out.println(t2);

        HelloThread ht = new HelloThread();
        java.lang.Thread t4 = new java.lang.Thread(ht);
        t4.start();


        Runnable r1 = new java.lang.Thread();
        System.out.println(r1);
        java.lang.Thread t5 =new java.lang.Thread(r,"Runnable,String");
        System.out.println(t5);

        //Thread Group
        ThreadGroup  threadGroup= new ThreadGroup("Java");
        java.lang.Thread t= new java.lang.Thread(threadGroup,"Core Java");
        System.out.println(t);

        Runnable r3= new java.lang.Thread();
        ThreadGroup threadGroup1=new ThreadGroup("ThreadGroup");
        java.lang.Thread t7=new java.lang.Thread(threadGroup1,r3);
        System.out.println(t7);

        //threadGroupname,runnable,String
        Runnable r4 = new java.lang.Thread();
        ThreadGroup threadGroup2=new ThreadGroup("ThreadGp-Sree");
        java.lang.Thread t8= new Thread(threadGroup2,r4,"Hello");
        System.out.println(t8);


    }
}
