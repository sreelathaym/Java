package com.java.core.thread;
class MyThread extends Thread{
    public void run(){
        for(int i=0; i<20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class CurrentThreadEx1 {
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.setName("AAAA");
        myThread.start();

        MyThread myThread1 =new MyThread();
        myThread1.setName("BBB");
        myThread1.start();
        MyThread myThread2 =new MyThread();
        myThread2.setName("CC");
        myThread2.start();
    }
}
