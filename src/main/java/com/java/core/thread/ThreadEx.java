package com.java.core.thread;

class Test{
    public static void main(String[] args) {
        ThreadEx t = new ThreadEx();
        t.start();
        for(int i=0;i<2;i++){
            System.out.println("Main Thread--"+i);
        }
    }
    public static class ThreadEx extends Thread {
        public void run() {
            for (int i = 0; i < 2; i++) {
                System.out.println("ChildThread--" + i);
            }
        }
    }
}
