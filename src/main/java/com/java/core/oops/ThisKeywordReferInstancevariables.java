package com.java.core.oops;
class Student1{
    String name;
    int age;

    public Student1(String name, int age) {
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
    public void displayInfo(){
        System.out.println("Student name---"+this.name);
        System.out.println("Student age----"+this.age);
        System.out.println("Student name---"+name);
        System.out.println("Student age----"+age);
    }
}
public class ThisKeywordReferInstancevariables {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Sree", 30);
        student1.displayInfo();

        student1.setAge(25);
        System.out.println("Updated Age---"+student1.getAge());

    }
}
