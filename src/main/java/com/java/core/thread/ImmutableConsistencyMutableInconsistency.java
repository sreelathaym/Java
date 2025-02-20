package com.java.core.thread;
//Inconsistency
class A2 {
    StringBuffer sb = new StringBuffer("Sree");

    void add() {
        sb = sb.append("Latha");
        System.out.println(sb);
    }
}

////    //Consistency
//class A3 {
//
//    String s = "sree"
    //String s1=null;
//
//    void add() {
//        s1 = s.concat("Latha");
//        System.out.println(Thread.currentThread() + "   :  " + s1);
//    }
//  }

    class IThread extends Thread {
        A2 a;

        IThread(A2 a) {
            this.a = a;
        }

        public void run() {
            a.add();
        }
    }

    class IThread1 extends Thread {
        A2 a;

        IThread1(A2 a) {
            this.a = a;
        }

        public void run() {
            a.add();
        }
    }

    public class ImmutableConsistencyMutableInconsistency {
        public static void main(String[] args) {
            A2 a = new A2();
            //A3 a1=new A3();
            //A3 a1 = new A3();
            IThread t = new IThread(a);
            IThread1 t1 = new IThread1(a);
            t.start();
            t1.start();
        }
    }

