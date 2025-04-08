package com.java.core.java8_v;

public class AnnanymousRunnable {

    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<6;i++){
                    System.out.println(i);
                }
            }
        };
        Thread t= new Thread(r);
        t.start();;
    }
}
