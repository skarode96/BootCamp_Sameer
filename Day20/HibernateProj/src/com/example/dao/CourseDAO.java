package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

public class CourseDAO {
    public void save(EntityManagerFactory managerFactory){

        Course course1 = new Course("Arts", 3, 38907);
        Course course2 = new Course("Commerce", 3, 34667);
        Course course3 = new Course("Science", 3, 34667);
        Course course4 = new Course("Acturial Science", 1, 367);

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        transaction.commit();
        entityManager.close();

    }

    public void update(EntityManagerFactory managerFactory){
        EntityManager manager = managerFactory.createEntityManager();
        Course course =  manager.find(Course.class,3);
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        course.setTitle("Dojo");
        transaction.commit();

    }

    public void readById(EntityManagerFactory managerFactory){
        EntityManager manager = managerFactory.createEntityManager();
       Course course =  manager.find(Course.class,3);
        System.out.println(course.toString());
    }

    public void delete(EntityManagerFactory entityManagerFactory){
        EntityManager manager = entityManagerFactory.createEntityManager();
        Course course = manager.find(Course.class,2);
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.remove(course);
        transaction.commit();
    }
}
