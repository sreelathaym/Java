package com.java.core.thread;
class SynThread2 extends Thread{
    A1 a;
    SynThread2(A1 a){
        this.a=a;
    }
    public void run(){
        a.increment();
    }
}
class SynThread3 extends Thread{
    A1 a;
    SynThread3(A1 a){
        this.a=a;
    }
    public void run(){
        a.increment();
    }
}
class A1{

    void increment(){
        int i =10;
        i =i+10;
        System.out.println(Thread.currentThread()+"  :  "+i);
    }
}
public class LocalVariableDataConsistency {
    public static void main(String[] args) {
        A1 a = new A1();
        SynThread2 synThread= new SynThread2(a);
        SynThread3 synThread1= new SynThread3(a);
        synThread.setName("AAAA");
        synThread1.setName("BBB");
        synThread.start();
        synThread1.start();
    }
}
