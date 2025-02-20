package com.java.core.oops;
class Employee1{
   private   String name;
   private double sal;

    public Employee1(String name, double sal) {
        //constructor chaining
        this();
        this.name = name;
        this.sal = sal;
    }
    public Employee1(){
        System.out.println("Zero Arg Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void displayInfo(){
        System.out.println("Employee Details::"+"\nEmployee Name--"+this.name+"\nEmployee Sal--"+this.sal);
    }
    public void register(Department department){
        department.show(this);
    }
}
class Department{
    private String depName;

    public Department(String depName) {
        this.depName = depName;
    }

    public void show(Employee1 e){
        System.out.println("Emaployee --"+e.getName());
    }

}
public class ThisForConstructorChaining {
    public static void main(String[] args) {
        Employee1 emp=new Employee1("sree",15000);
        emp.displayInfo();

        Department dep=new Department("Admin");
        emp.register(dep);
        System.out.println();


    }
}
