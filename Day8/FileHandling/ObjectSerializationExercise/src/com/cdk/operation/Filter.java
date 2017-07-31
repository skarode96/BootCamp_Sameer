package com.cdk.operation;

import com.cdk.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by karodes on 7/27/2017.
 */
public class Filter {
    public static ArrayList<Employee> filterData(ArrayList<Employee> employeeList) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.getSalary() < 40000.00){
                iterator.remove();
            }
        }
        return employeeList;
    }

}
