package com.company.project;

import com.company.employee.Employee;

/**
 * Created by karodes on 7/25/2017.
 */
public class ProjectManager {

    public static void changeProject(Employee employee, String projectName) {
        employee.project = projectName;
    }
}
