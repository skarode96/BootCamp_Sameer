package com.company.test;

import com.company.employee.Employee;
import com.company.file.ObjectReader;
import com.company.file.ObjectWriter;
import com.company.operation.Filter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by karodes on 7/27/2017.
 */
public class TestClass {
    //for checking writing operation
    @Test
    public void test1() {
        ArrayList<Employee> employeeArrayList = Employee.getEmployeeData();
        Filter.filterData(employeeArrayList);
        Collections.sort(employeeArrayList);
        Iterator<Employee> iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
        ObjectWriter.writeData(employeeArrayList);

    }
    // For filtering the list
    @Test
    public void test2() {
        ArrayList<Employee> employeeList = Employee.getEmployeeData();
        Filter.filterData(employeeList);
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
    //for reading operation
    @Test
    public void test3(){
        ObjectReader.readData();
    }


}