package com.java.core.java8_v;

public class InstanceMethodRef {
    public void m1(){
        for(int i=1;i<=6;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        InstanceMethodRef ref =new InstanceMethodRef();
        Runnable r=ref::m1;
        Thread t= new Thread(r);
        t.start();
    }
}

