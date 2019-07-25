package com.company.services;

import com.company.employee.Employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class HrService {

    public static void updateSalary(Employee employee, double salary) {
        employee.salary = salary;
    }
    public static void changeDesignation(Employee employee,String designation) {
        employee.design = designation;
    }

}
