package com.java.core.thread;
class SynThread extends Thread{
    AA a;
    SynThread(AA a){
        this.a=a;
    }
    public void run(){
        a.increment();
    }
}
class SynThread1 extends Thread{
    AA a;
    SynThread1(AA a){
        this.a=a;
    }
    public void run(){
        a.increment();
    }
}
class AA{
    int i =10;
    void increment(){
      i =i+10;
        System.out.println(Thread.currentThread()+"  :  "+i);
    }
}
public class InstanceVariableDataIncosistency {
    public static void main(String[] args) {
        AA a = new AA();
        SynThread synThread= new SynThread(a);
        SynThread1 synThread1= new SynThread1(a);
        synThread.setName("AAAA");
        synThread1.setName("BBB");
        synThread.start();
        synThread1.start();

    }
}
