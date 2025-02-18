package com.java.core.thread;

public class SetNameGetName {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getName());
        t.setName("HelloTread");
        System.out.println(t.getName());
    }
}
