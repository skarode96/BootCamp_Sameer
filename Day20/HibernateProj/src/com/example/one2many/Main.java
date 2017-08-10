package com.example.one2many;

import com.example.dao.EmployeeDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");

        AllDAO.countAll(managerFactory);
        //AllDAO.readName(managerFactory);
        //AllDAO.readNameAndAge(managerFactory);
        //AllDAO.readAll(managerFactory);
        //AllDAO.readPerson(managerFactory);
        //AllDAO.saveAll(managerFactory);
        //AllDAO.saveAddress(managerFactory);

        managerFactory.close();

    }
}
