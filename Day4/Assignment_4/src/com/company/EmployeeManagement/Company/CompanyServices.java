package com.company.EmployeeManagement.Company;

import com.company.EmployeeManagement.Employee.EmployeeService;
import com.company.EmployeeManagement.Employee.EmployeeServiceImpl;

/**
 * Created by karodes on 7/16/2017.
 */
public interface CompanyServices {

    void hireEmployee(int noOfEmployee);

    void manageAttendance(EmployeeServiceImpl employeeServiceImpl);

    void managePayroll(EmployeeService employeeService);

    void managePromotion(EmployeeService employeeService);
}
