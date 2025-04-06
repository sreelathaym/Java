package com.java.core.oops.singleton;

public class DataBaseConnection {
    //creating instance
    private static DataBaseConnection instance;

    //private constructor
    private DataBaseConnection(){
        System.out.println("DataBase connection established");
    }
    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance= new DataBaseConnection();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Connection established through Singleton instance");
    }
    public void executeQuery(String query) {
        System.out.println("Executing Query: " + query);
    }

}
class DbConnectionTest{
    public static void main(String[] args) {
        DataBaseConnection db1= DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();
        db2.showMessage();
        db1.executeQuery("Select * from Users");

        System.out.println(db1==db2);

    }
}
