package com.java.core.thread;
class GarbageCollector extends Thread{
    public void run(){
      while(true){
          System.out.println("Garbage collector Thread");
        }
    }
}
public class DemonThreads {
    public static void main(String[] args) {

        //setDamon =true it is Demon
        GarbageCollector gc = new GarbageCollector();
        gc.setDaemon(true);
        gc.start();
      //  gc.setDaemon(true);  --->we will get exception demon thread before start() method need to set
//once JVM thread count executed automatically terminate
        for (int i =0; i<10; i++){
            System.out.println("JVM Thread");
        }
        System.out.println(gc.isDaemon());
    }
}
