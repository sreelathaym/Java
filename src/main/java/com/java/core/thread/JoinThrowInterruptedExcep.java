package com.java.core.thread;
class WelComeThread extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("WelCome Thread--" +i);
        }
    }

}
public class JoinThrowInterruptedExcep {
    public static void main(String[] args) throws InterruptedException {
        WelComeThread t = new WelComeThread();
        t.start();
        //t.join();
        for(int i=0;i<20;i++){
            System.out.println("Main Thread--"+i);
        }

    }

}
