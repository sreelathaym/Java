package com.java.core.thread;
class Block{
     void display() {
         System.out.println("Before Sync Block: "+Thread.currentThread().getName());
        //Synchronized block---current class object we need to pass
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Inside Sync Block: "+Thread.currentThread().getName());
            }
        }
    }
}
class SyncThread extends Thread{
    Block b;
    public SyncThread(Block b){
        this.b = b;
    }
    public  void run(){
        b.display();
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Block b = new Block();
        SyncThread t1= new SyncThread(b);
        SyncThread t2= new SyncThread(b);
        SyncThread t3= new SyncThread(b);
        t1.setName("AAAAAA");
        t2.setName("BBBB");
        t3.setName("CC");
        t1.start();
        t2.start();
        t3.start();

    }
}
