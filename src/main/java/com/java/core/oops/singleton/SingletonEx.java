package com.java.core.oops.singleton;

public class SingletonEx {
   // Step 1: Create a private static instance of the class
    private  static SingletonEx instance;
    //  Step 2: Private constructor to prevent external instantiation
    private SingletonEx(){
        System.out.println("Singleton instance created");
    }
    // Step 3: Public method to provide a global access point
    public static SingletonEx getInstance(){
        if(instance == null){
            instance = new SingletonEx();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

}
class SingletonTest{
    public static void main(String[] args) {
        SingletonEx obj1= SingletonEx.getInstance();
        SingletonEx obj2= SingletonEx.getInstance();

        obj1.showMessage();
        System.out.println(obj1==obj2);//true
    }
}
