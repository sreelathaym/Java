package com.java.core.oops;
 class Thread implements Runnable{
Runnable r =null;
public Thread(){}
    public Thread(Runnable r){}
    @Override
    public void run() {

    }
    public void start(){
    if(r==null) {
        this.run();
    }else {
        r.run();
    }
    }
}
class WelcomeThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("WelcomeThread--"+i);
        }
    }
}
public class FlowOfExecution {
    public static void main(String[] args) {
        WelcomeThread wt= new WelcomeThread();
        wt.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread--"+i);
        }
    }
}
