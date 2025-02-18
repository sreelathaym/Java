package com.java.core.thread;

public class IsAlive {
    public static void main(String[] args) {
        System.out.println(Thread.getAllStackTraces());
        Thread t =new Thread();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        System.out.println(t.isAlive());
        System.out.println(t.isAlive());//it may be still running
        System.out.println(t.isAlive());//it may be execution complete
        for(int i=0;i<20;i++){
            System.out.println(t.isAlive()+"  --");
        }
    }
}
