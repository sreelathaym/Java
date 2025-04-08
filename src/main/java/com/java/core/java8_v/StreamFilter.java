package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class User1{
    String name;
    int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class StreamFilter {
    public static void main(String[] args) {
        User1 u1= new User1("Sree",10);
        User1 u2= new User1("LAtha",30);
        User1 u3= new User1("Abhi",20);
        User1 u4= new User1("Bob",15);

        Stream<User1> stream=Stream.of(u1,u2,u3,u4);
        //stream.filter(i->i.age>=18).forEach(System.out::println);
//        stream.filter(u->u.age>18 && u.name.startsWith("A"))
//                .forEach(u->System.out.println(u));
        stream.filter(u->u.age>18)
                .filter(u->u.name.startsWith("A"))
                .forEach(u-> System.out.println(u));
    }
}
