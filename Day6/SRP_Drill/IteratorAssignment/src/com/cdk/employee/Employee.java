package com.cdk.employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class Employee {
    public int empId;
    public String name;
    public double salary;
    public long phone;
    public String design;
    public String project;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee(int empId, String name, long phone) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public long getPhone() {
        return phone;
    }

    public String getDesign() {
        return design;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                ", design='" + design + '\'' +
                '}';
    }
}
