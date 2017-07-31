package com.cdk.test;

import com.cdk.project.ProjectManager;
import com.cdk.services.AccountService;
import com.cdk.employee.Employee;
import com.cdk.services.HrService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by karodes on 7/25/2017.
 */
public class TestClass {
    @Test
    public void test1() {
        Employee employee = new Employee(23, "Sameer",998898899);
        HrService.changeDesignation(employee, "G2L2");
        HrService.updateSalary(employee, 50000.00);
        System.out.println("TDS : " + AccountService.calculateTDS(employee));
        ProjectManager.changeProject(employee, "Java Project");
        System.out.println(employee);
    }

    // Exercise for Iterator
    @Test
    public void test2() {
        List<Employee> employeeList = new ArrayList<>(10);
        employeeList.add(new Employee("Sameer", 50000));
        employeeList.add(new Employee("Mahesh", 40000));
        employeeList.add(new Employee("Mukta", 50000));
        employeeList.add(new Employee("Nitesh", 60000));
        employeeList.add(new Employee("Jeetu", 50000));
        employeeList.add(new Employee("Jaggu", 100000));
        employeeList.add(new Employee("Sneh", 50000));
        employeeList.add(new Employee("Jagtap", 50000));
        employeeList.add(new Employee("Raju", 50000));
        employeeList.add(new Employee("Nishant", 50000));

        Iterator<Employee> itr = employeeList.iterator();
        double hra = 0;
        while (itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println("HRA of " + employee.getName() + " : " + employee.getSalary() * 0.30);
        }
    }
    
    @Test
    public void test3(){
        List<Employee> employeeList = new ArrayList<>(10);
        employeeList.add(new Employee("Sameer", 10000));
        employeeList.add(new Employee("Mahesh", 12000));
        employeeList.add(new Employee("Mukta", 5000));
        employeeList.add(new Employee("Nitesh", 6000));
        employeeList.add(new Employee("Jeetu", 50000));
        employeeList.add(new Employee("Jaggu", 100000));
        employeeList.add(new Employee("Sneh", 50000));
        employeeList.add(new Employee("Jagtap", 50000));
        employeeList.add(new Employee("Raju", 50000));
        employeeList.add(new Employee("Nishant", 50000));
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            if(employee.getSalary() <= 10000.00){
                HrService.updateSalary(employee,employee.getSalary()*1.20);
            }
        }
        System.out.println("========After updating salaries=======");
        itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println("Salary of " + employee.getName() + " : " + employee.getSalary());
        }
    }

}

