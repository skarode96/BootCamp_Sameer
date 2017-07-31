package com.cdk.EmployeeManagement.Company;

import com.cdk.EmployeeManagement.Employee.EmployeeService;
import com.cdk.EmployeeManagement.Employee.EmployeeServiceImpl;
import com.cdk.EmployeeManagement.Enums.City;
import com.cdk.EmployeeManagement.Enums.Grade;

/**
 * Created by karodes on 7/16/2017.
 */
public class CompanyServiceImpl implements CompanyServices {

    String name;
    int strength;
    City city;

    public CompanyServiceImpl(String name, int strength, City city) {
        this.name = name;
        this.strength = strength;
        this.city = city;
    }


    @Override
    public void hireEmployee(int noOfEmployee) {
        this.strength = this.strength + noOfEmployee;
        System.out.println("Hiring new employee ....");
        System.out.println("Now " + this.name + " has : " + this.strength);
        System.out.println("=========================");
    }

    @Override
    public void manageAttendance(EmployeeServiceImpl employeeServiceImpl) {
        employeeServiceImpl.updateAttendance(true);
        System.out.println("Attendance of " + employeeServiceImpl.name + " updated succesfully");

    }

    @Override
    public void managePayroll(EmployeeService employeeService) {
        System.out.println("======Managing payroll=====");
        employeeService.getPayrollDetails();

    }

    @Override
    public void managePromotion(EmployeeService employeeService) {
        employeeService.managePromotion(Grade.CTO);
    }
}
