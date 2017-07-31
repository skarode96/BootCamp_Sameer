package com.cdk.EmployeeManagement.Employee;

import com.cdk.EmployeeManagement.Enums.Grade;

/**
 * Created by karodes on 7/16/2017.
 */
public interface EmployeeService {

    void getDetails();
    void updateAttendance(boolean status);
    void getPayrollDetails();
    void managePromotion(Grade grade);
}
