package com.cdk.dao;

import com.cdk.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDAO {
    public void save(EntityManagerFactory managerFactory){
        Course course = new Course("Maths1", 3, 1054.00);
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(course);
        transaction.commit();
        entityManager.close();
        managerFactory.close();
    }
    public void update(EntityManagerFactory managerFactory,int id){
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class,id);
        course.setTitle("NewCourse");
        transaction.commit();
        System.out.println(course);
        entityManager.close();
        managerFactory.close();
    }
    public void read(EntityManagerFactory managerFactory,int id){
//        Course course = new Course(1,"Dojo", 10, 9054.00);
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class,id);
        transaction.commit();
        System.out.println(course);
        entityManager.close();
        managerFactory.close();
    }
    public void delete(EntityManagerFactory managerFactory,int id){
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
        transaction.commit();
        System.out.println(course);
        entityManager.close();
        managerFactory.close();
    }



}
