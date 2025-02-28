package com.java.core.exceptions;
class Emp{
    static{
        System.out.println("Employee class is Loading...");
    }
    private Emp(){
        System.out.println("Emp object is creating..");
    }


//     Emp(){
//        System.out.println("Emp object is creating..");
//    }

//    private Emp(int i){
//        System.out.println("Object is creating");
//    }
}
public class IllegalAccessExce {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("com.java.core.exceptions.Emp");
        Object obj=c.newInstance();
    }
}
