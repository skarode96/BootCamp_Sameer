package com.cdk.services;

import com.cdk.employee.Employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class AccountService {

    public static double calculateTDS(Employee employee) {
        return (0.18*employee.salary);
    }

}
