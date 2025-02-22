package com.java.core.thread;
class Sync{
    synchronized void display(){
        for(int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class ThreadSy extends  Thread{
    Sync a;
    ThreadSy(Sync a){
        this.a = a;
    }
    public void run(){
        a.display();
    }
}
class ThreadSy1 extends  Thread{
    Sync a;
    ThreadSy1(Sync a){
        this.a = a;
    }
    public void run(){
        a.display();
    }
}
class ThreadSy2 extends  Thread{
    Sync a;
    ThreadSy2(Sync a){
        this.a = a;
    }
    public void run(){
        a.display();
    }
}


public class SynchronizedMethod {
    public static void main(String[] args) {
      Sync a= new Sync();
      Thread t1 = new ThreadSy(a);
      Thread t2 = new ThreadSy1(a);
      Thread t3 = new ThreadSy2(a);
      t1.setName("AAAAA");
      t2.setName("BBBB");
      t3.setName("CCC");
      t1.start();
      t2.start();
      t3.start();

    }
}
