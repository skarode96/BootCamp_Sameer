package com.example.one2many;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

public class AllDAO {


    public static void countAll(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();


        Query query =  entityManager.createQuery("select count(*) from Person");

        Object val = query.getSingleResult();
        System.out.println(val);


        entityManager.close();

    }


    public static void readName(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();


        Query query =  entityManager.createQuery("select p.name from Person p where p.age > 40");

        String name = (String)query.getSingleResult();
        System.out.println(name);

        /*List<String> list = query.getResultList();
        for(String name :  list) {
            System.out.println(name);
        }*/

        entityManager.close();

    }



    public static void readNameAndAge(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();


        //Query query =  entityManager.createQuery("select p.name,p.age from Person p where p.age > 40");

        Query query =  entityManager.createQuery("select p.name,p.age from Person p order by p.age desc");
        //query.setFirstResult(2);
        //query.setMaxResults(2);

        List<Object[]> list = query.getResultList();
        for(Object[] array :  list) {
            System.out.println(array[0]);
            System.out.println(array[1]);
        }

        entityManager.close();

    }


    public static void readAll(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

            //Query query =  entityManager.createQuery("from Person");
            Query query =  entityManager.createQuery("from Person p where p.age > 40");

            List<Person> list = query.getResultList();
            System.out.println(list);

        entityManager.close();

    }


    public static void readPerson(EntityManagerFactory managerFactory){

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Person person = entityManager.find(Person.class,2);
        System.out.println(person);

        /*Set<Address> set = person.getAddresses();
        for(Address address : set){
            System.out.println(address);
        }*/

        transaction.commit();
        entityManager.close();

    }



    public static void saveAddress(EntityManagerFactory managerFactory){

        Address home = new Address("Mumbai","MH");

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

                    Person person = entityManager.find(Person.class,1);
                    System.out.println(person);
                    person.getAddresses().add(home);

        transaction.commit();
        entityManager.close();

    }


    public static void saveAll(EntityManagerFactory managerFactory){

        Address home = new Address("Delhi","New Delhi");
        Address office = new Address("Pune","MH");

        Person person = new Person("Rohan","9810000000",24);
        person.getAddresses().add(home);
        person.getAddresses().add(office);

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
            entityManager.persist(person);
        transaction.commit();
        entityManager.close();

    }

}
