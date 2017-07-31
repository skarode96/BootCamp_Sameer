package com.cdk.project;

import com.cdk.employee.Employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class ProjectManager {

    public static void changeProject(Employee employee, String projectName) {
        employee.project = projectName;
    }
}
