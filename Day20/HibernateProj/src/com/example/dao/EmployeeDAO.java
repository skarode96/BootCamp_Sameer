package com.example.dao;

import com.example.entity.Course;
import com.example.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

public class EmployeeDAO {


    public static void update(EntityManagerFactory managerFactory){

        Employee employee = new Employee(2,"Raghu",20,9000.00);

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

            entityManager.merge(employee);

        transaction.commit();
        entityManager.close();
    }

    /*public static void update(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();

            Employee employee = entityManager.find(Employee.class, 1);

            employee.setName("Binay");
            employee.setSalary(employee.getSalary() * .30);

            transaction.commit();
        }catch (PersistenceException e){
            transaction.rollback();
        }
        entityManager.close();
    }*/

    public static void read(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
            Employee employee = entityManager.find(Employee.class,2);
        System.out.println(employee);
        transaction.commit();
        entityManager.close();

    }

    public static void save(EntityManagerFactory managerFactory){

        Employee employee = new Employee("Pintu",20,3000000.00);

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
            entityManager.persist(employee);
        transaction.commit();
        entityManager.close();

    }





    public void delete(EntityManagerFactory entityManagerFactory){
    }
}
