package com.company.services;

import com.company.employee.Employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class AccountService {

    public static double calculateTDS(Employee employee) {
        return (0.18*employee.salary);
    }

}
