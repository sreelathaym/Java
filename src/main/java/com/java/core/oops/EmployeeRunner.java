package com.java.core.oops;
//Inheritance
class Employee{
    String empName;
    String empId;

    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }
    public double calculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;
    private double bonus;

    public FullTimeEmployee(String empName, String empId, double monthlySalary,double bonus ) {
        super(empName, empId);
        this.monthlySalary = monthlySalary;
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }
}

class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String empName, String empId,double hourlyRate,int hoursWorked) {
        super(empName, empId);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

}

public class EmployeeRunner {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Honey", "FT-123", 30000.0, 1200.0);
        System.out.println("FullTime Employee Salary Details\n"+"------------------\n"
                +"Employee name::" +fullTimeEmp.empName+"\n"+
                "Employee Id::"+fullTimeEmp.empId+"\n"+"Salary::"+fullTimeEmp.calculateSalary());

        //PartTime Employee Details
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Janu","PT-456", 20.0, 60);
        System.out.println("\nPartTime Employee Salary Details\n"+"-----------------------\n"
                +"Employee name::" +partTimeEmp.empName+"\n"+
                "Employee Id::"+partTimeEmp.empId+"\n"+"Salary::"+partTimeEmp.calculateSalary());

    }
}
