package com.example.client;

import com.example.dao.CourseDAO;
import com.example.dao.EmployeeDAO;
import com.example.entity.Course;
import com.example.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");

        EmployeeDAO.save(managerFactory);
        //EmployeeDAO.read(managerFactory);
        //EmployeeDAO.update(managerFactory);


        //CourseDAO courseDAO = new CourseDAO();
        //courseDAO.save(managerFactory);
        //courseDAO.update(managerFactory);
        //courseDAO.readById(managerFactory);
        //courseDAO.delete(managerFactory);
        managerFactory.close();

    }
}
