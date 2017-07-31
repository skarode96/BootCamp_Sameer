
package com.cdk.employee;

import com.cdk.annotations.Company;
import com.cdk.annotations.TimeStamp;
import com.cdk.enums.DAY;
import com.cdk.enums.MONTH;
import com.cdk.enums.YEAR;


/**
 * Created by karodes on 7/24/2017.
 */
@Company(name = "CDK global",location = "Pune")
@TimeStamp(year = YEAR.YEAR2015,month = MONTH.JUL,day = DAY.MON)

public class Employee {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
