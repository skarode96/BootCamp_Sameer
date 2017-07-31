package com.cdk.EmployeeManagement.Employee;

import com.cdk.EmployeeManagement.Enums.Grade;
import com.cdk.EmployeeManagement.Enums.Month;
import com.cdk.EmployeeManagement.Enums.Year;

/**
 * Created by karodes on 7/16/2017.
 */
public class EmployeeServiceImpl implements EmployeeService {

    public String name;
    boolean attendace;
    double payroll;
    Month joiningMonth;
    Year joiningYear;
    Grade grade;

    public EmployeeServiceImpl(String name, double payroll, Month joiningMonth, Year joiningYear, Grade grade) {
        this.name = name;
        this.attendace = false;
        this.payroll = payroll;
        this.joiningMonth = joiningMonth;
        this.joiningYear = joiningYear;
        this.grade = grade;
    }


    @Override
    public void getDetails() {
        System.out.println("===== Employee Details ======");
        System.out.println("Employee Name : " + this.name);
        System.out.println("Attendace Status : " + this.attendace);
        System.out.println("Payroll : " + payroll);
        System.out.println("Month of Joining : " + this.joiningMonth);
        System.out.println("Year of Joining : " + this.joiningYear);
        System.out.println("Grade of Employee : " + this.grade);

    }



    @Override
    public void updateAttendance(boolean status) {
        if (status == true)
            this.attendace = true;
        else
            this.attendace = false;
        System.out.println("Employee attendance status : " + this.attendace);
    }

    @Override
    public void getPayrollDetails() {
        System.out.println("Payroll of Employee : " + this.payroll);
    }


    @Override
    public void managePromotion(Grade grade) {
        if(grade.value > this.grade.value) {
            this.grade = grade;
            System.out.println("Congratulation !! You have been promoted to Grade : " + this.grade );
        }
        else {
            System.out.println("Sorry you can't decrease grade of employee");
        }
    }
}
