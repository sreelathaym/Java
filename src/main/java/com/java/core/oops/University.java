package com.java.core.oops;

import java.util.ArrayList;
import java.util.List;

// Student class with name and rollNo.
class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}
public class University {
    // University class that aggregates Student objects.
        private String universityName;
        private List<Student> students;

    public University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
    }
    // Method to add a student to the university.
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the university.
    public void displayStudents() {
        System.out.println("Students at " + universityName + ":");
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
class  UniversityStudentAggregation {
    public static void main(String[] args) {
        // Create Student objects independently.
        Student student1 = new Student("AAA", 101);
        Student student2 = new Student("BBB", 102);
        Student student3 = new Student("CCCC", 103);

        // Create a University and add students.
        University university = new University("ABC University");
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        // Display students within the University.
        university.displayStudents();

        // Now, suppose the University is removed (or its student list is discarded).
        // The Student objects still exist because they were created independently.
        university = null; // The reference to the University is removed.

        // We can still use student objects directly.
        System.out.println("\nStudents still exist even after University is removed:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

