package com.cdk.employee;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by karodes on 7/29/2017.
 */
public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public static ArrayList<Employee> getData() {
        ArrayList<Employee>employeeArrayList =  new ArrayList<Employee>(10);
        employeeArrayList.add(new Employee("Sameer",50000.00));
        employeeArrayList.add(new Employee("Mukta",50800.00));
        employeeArrayList.add(new Employee("Mahesh",30000.00));
        employeeArrayList.add(new Employee("Nitesh",10000.00));
        employeeArrayList.add(new Employee("Dipali",34000.00));
        employeeArrayList.add(new Employee("Pranali",50600.00));
        employeeArrayList.add(new Employee("Sneh",4000.00));
        employeeArrayList.add(new Employee("JAggu",5000.00));
        employeeArrayList.add(new Employee("Pintu",1000.00));
        employeeArrayList.add(new Employee("Chandu",50400.00));
        employeeArrayList.add(new Employee("Nilesh",50060.00));
        employeeArrayList.add(new Employee("Nilay",50003.00));
        employeeArrayList.add(new Employee("Milay",60000.00));
        employeeArrayList.add(new Employee("Akshay",70000.00));
        employeeArrayList.add(new Employee("Sudhir",80000.00));
        employeeArrayList.add(new Employee("Kamal",90000.00));
        employeeArrayList.add(new Employee("Harshita",90000.00));
        employeeArrayList.add(new Employee("Binay",100000.00));
        employeeArrayList.add(new Employee("Sushant",532000.00));
        employeeArrayList.add(new Employee("Arshi",5003400.00));
        employeeArrayList.add(new Employee("Rajan",500040.00));
        employeeArrayList.add(new Employee("Dhiraj",500.00));
        return employeeArrayList;
    }
}
