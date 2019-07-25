package com.example.client;

import com.company.dao.CourseDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        CourseDAO courseDAO = new CourseDAO();
//        courseDAO.save(managerFactory);
//        courseDAO.update(managerFactory);
//        courseDAO.read(managerFactory,2);
        courseDAO.delete(managerFactory,3);
        managerFactory.close();
    }
}
