package com.cdk.EmployeeManagement.Employee;

import com.cdk.EmployeeManagement.Company.CompanyServiceImpl;
import com.cdk.EmployeeManagement.Enums.City;
import com.cdk.EmployeeManagement.Enums.Grade;
import com.cdk.EmployeeManagement.Enums.Month;
import com.cdk.EmployeeManagement.Enums.Year;

/**
 * Created by karodes on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl("Sameer",25000, Month.MAR, Year.YEAR2017, Grade.SENIOR) ;
        CompanyServiceImpl compannyServiceImpl = new CompanyServiceImpl("CDK Global",1600, City.PUNE);
        compannyServiceImpl.hireEmployee(27);
        compannyServiceImpl.manageAttendance(employeeServiceImpl);
        compannyServiceImpl.managePayroll(employeeServiceImpl);
        compannyServiceImpl.managePromotion(employeeServiceImpl);
        employeeServiceImpl.getDetails();
    }
}
