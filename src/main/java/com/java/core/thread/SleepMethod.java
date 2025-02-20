package com.java.core.thread;
class MyThread1 extends Thread{
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
//                e.getMessage();
//                e.printStackTrace();
                throw new RuntimeException(e);
            }
            System.out.println("Welcome To Thread Chapter");
        }
    }

}
public class SleepMethod {
    public static void main(String[] args) {
        MyThread1 t= new MyThread1();
        t.start();
    }
}
