package com.java.core.thread;
class A{
    void m1(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Thread1 extends Thread{
    A a;
    Thread1(A a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}
class Thread2 extends Thread{
    A a;
    Thread2(A a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}
class Thread3 extends Thread{
    A a;
    Thread3(A a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}
public class CurrentThread {
    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        t1.setName("AAA");
        t1.start();
        Thread2 t2 = new Thread2(a);
        t2.setName("BBB");
        t2.start();
        Thread3 t3 = new Thread3(a);
        t3.setName("CCC");
        t3.start();

    }
}
