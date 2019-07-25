package com.company.EmployeeManagement.Enums;

/**
 * Created by karodes on 7/16/2017.
 */
public enum Grade {
    JUNIOR(1), SENIOR(2), MANAGER(3), CTO(4), CEO(5);
    public int value;
    Grade(int value){
        this.value = value;
    }
}
