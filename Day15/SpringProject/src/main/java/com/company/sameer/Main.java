package com.company.sameer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/company/sameer/spring-config.xml");
        Employee employee = (Employee)context.getBean("employee1");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
