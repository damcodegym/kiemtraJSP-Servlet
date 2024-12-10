package com.example.model;

public class Employee {
    private String ID;
    private String Name;
    private int age;
    private String JobPosition ;
    private String Department;
    private double Salary;

    public Employee(String ID, String name, int age, String jobPosition, String department, double salary) {
        this.ID = ID;
        this.Name = name;
        this.age = age;
        this.JobPosition = jobPosition;
        this.Department = department;
        this.Salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobPosition() {
        return JobPosition;
    }

    public void setJobPosition(String jobPosition) {
        JobPosition = jobPosition;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
