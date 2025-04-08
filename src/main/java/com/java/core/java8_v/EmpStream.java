package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    int age;
    float salary;

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class EmpStream {
    public static void main(String[] args) {
        Employee e1= new Employee("Sr",20,30000);
        Employee e2= new Employee("ar",30,50000);
        Employee e3= new Employee("br",40,60000);

        List<Employee> emp= Arrays.asList(e1,e2,e3);
//        emp.stream().filter(i->i.getSalary()>=50000)
//                .map(e->e.name +"_" +e.age)
//                .forEach(em-> System.out.println(em));
        emp.stream().filter(i->i.salary>=50000)
                .forEach(e-> System.out.println(e.name + "_"+e.age));




    }
}
