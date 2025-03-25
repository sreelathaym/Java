package com.java.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int eno;
    String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public int compareTo(Employee  other) {
        return this.ename.compareTo(other.ename);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
public class CompareToEx {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Charlie"));
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(2, "Bob"));
        System.out.println(employees);

        Collections.sort(employees);
        for(Employee emp:employees){
            System.out.println(emp.ename);
        }

    }
}
