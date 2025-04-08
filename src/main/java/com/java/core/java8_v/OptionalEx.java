package com.java.core.java8_v;


import java.util.Optional;
import java.util.Scanner;

class User{
    public String getUserNameBYId(Integer id){
        if(id==100){
            return "Rani";
        }
        else if(id ==101){
          return "Raja";
        }
        return null;

    }
    public Optional<String> getUserName(Integer id){
        if(id==100){
            return Optional.ofNullable("Rani");
        }
        else if(id ==101){
            return Optional.ofNullable("Raju");
        }
        return null;

    }

    public Optional<String> getUsername(Integer id){
        String name=null;
        if(id==100){
            name="Rani";

        }else if(id==101){
            name="Raju";
        }
        return Optional.ofNullable(name);
    }
}
class MsgService{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter User ID::");
        int userId=s.nextInt();
        User u=new User();
//        String userName=u.getUserNameBYId(userId);
//        if(userName !=null) {
//            System.out.println(userName.toUpperCase() + ", Hello");
//        }else {
//            System.out.println("Invalid Id");
//        }
        Optional<String> username=u.getUsername(userId);

        if(username.isPresent()){
           String name= username.get();
            System.out.println(name.toUpperCase());
        }else {
            System.out.println("No data  found");
        }
    }
}

public class OptionalEx {
    public static void main(String[] args) {

    }
}
