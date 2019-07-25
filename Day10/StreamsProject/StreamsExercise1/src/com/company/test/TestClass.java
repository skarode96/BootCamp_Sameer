package com.company.test;

import com.company.employee.Employee;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by karodes on 7/29/2017.
 */
public class TestClass {
    @Test
    public void test1(){
        ArrayList<Employee>employeeArrayList = Employee.getData();
        double totalTds = employeeArrayList.stream()
                .filter((employee)->employee.getSalary()>50000.00)
                .map((employee -> employee.getSalary()*0.10)).reduce((acc,tds)->acc+tds).get();
        System.out.printf("Total Tds : %s",totalTds);
    }
    @Test
    public void test2(){
        ArrayList<Employee>employeeArrayList = Employee.getData();
        int temp = 1;

//        int count = employeeArrayList.stream()
//                    .map((employee -> 1))
//                    .reduce((acc,num)->acc+num).get();
        int count = (int) employeeArrayList.stream().count();
        System.out.printf("There are %s many employees in CDK\n",count);
        double salary = employeeArrayList.stream()
                .map((employee -> employee.getSalary()))
                .reduce((totalSalary,Salary)->totalSalary+Salary).get();
        System.out.printf("Total salary of all employees %s\n",salary);
        System.out.printf("Avg of all employees : %s\n",(salary/count));

       double minSalary = employeeArrayList.stream()
                        .map(employee -> employee.getSalary())
                        .min((o1, o2) -> (int) (o1-o2)).get();
       double maxSalary = employeeArrayList.stream()
                        .map(employee -> employee.getSalary())
                        .max((o1,o2)->(int) (o1-o2)).get();
        System.out.println("Minimum Salary : " + minSalary);
        System.out.println("Maximum Salary : " + maxSalary);

    }
    @Test
    public void test3(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory()-runtime.freeMemory());
        //        runtime = null;
        System.gc();


    }
}
