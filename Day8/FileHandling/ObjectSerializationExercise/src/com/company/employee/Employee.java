package com.company.employee;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by karodes on 7/27/2017.
 */
public class Employee implements Comparable<Employee>,Serializable{
    private int uid;
    private String name;
    private transient double salary;
    private String location;

    public Employee(int uid, String name, double salary, String location) {
        this.uid = uid;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public static ArrayList<Employee> getEmployeeData() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(30);
        employeeArrayList.add(new Employee(1, "Sameer", 50000.00, "Pune"));
        employeeArrayList.add(new Employee(2, "Mahesh", 60000.00, "Pune"));
        employeeArrayList.add(new Employee(3, "Nitesh", 40000.00, "Pune"));
        employeeArrayList.add(new Employee(4, "Harshala", 30000.00, "Pune"));
        employeeArrayList.add(new Employee(5, "Mukta", 50000.00, "Pune"));
        employeeArrayList.add(new Employee(6, "Nilesh", 20000.00, "Pune"));
        employeeArrayList.add(new Employee(7, "Wasim", 10000.00, "Pune"));
        employeeArrayList.add(new Employee(8, "Aryan", 30000.00, "Pune"));
        employeeArrayList.add(new Employee(9, "Jaggu", 40000.00, "Pune"));
        employeeArrayList.add(new Employee(10, "Pintu", 56000.00, "Pune"));
        employeeArrayList.add(new Employee(11, "Chintu", 56000.00, "Pune"));
        employeeArrayList.add(new Employee(12, "Nisha", 21000.00, "Pune"));
        employeeArrayList.add(new Employee(13, "Isha", 53400.00, "Pune"));
        employeeArrayList.add(new Employee(14, "Kamal", 52000.00, "Pune"));
        employeeArrayList.add(new Employee(15, "Arshi", 20000.00, "Pune"));
        return employeeArrayList;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return this.getUid()-o.getUid();
    }
}
