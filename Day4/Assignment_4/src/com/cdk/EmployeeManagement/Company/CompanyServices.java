package com.cdk.EmployeeManagement.Company;

import com.cdk.EmployeeManagement.Employee.EmployeeService;
import com.cdk.EmployeeManagement.Employee.EmployeeServiceImpl;

/**
 * Created by karodes on 7/16/2017.
 */
public interface CompanyServices {

    void hireEmployee(int noOfEmployee);

    void manageAttendance(EmployeeServiceImpl employeeServiceImpl);

    void managePayroll(EmployeeService employeeService);

    void managePromotion(EmployeeService employeeService);
}
