package com.java.core.thread;

public class SetPriority {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Default Value---"+t.getPriority());
        System.out.println();
        t.setPriority(2);
        System.out.println("After modified User defined Priority--"+t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY-3);
        System.out.println("After modified Max--"+t.getPriority());
        t.setPriority(Thread.MIN_PRIORITY+Thread.NORM_PRIORITY);
        System.out.println("After modified Min--"+t.getPriority());
        t.setPriority(Thread.NORM_PRIORITY);
        System.out.println("After modified Norm--"+t.getPriority());
    }
}
