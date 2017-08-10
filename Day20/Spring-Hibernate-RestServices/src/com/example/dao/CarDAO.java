package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarDAO {

    @PersistenceContext
    EntityManager entityManager;


    public int update(Car car){
        entityManager.merge(car);
       return car.getVin();
    }

    public int save(Car car){
        entityManager.persist(car);
        return car.getVin();
    }


    public Car selectByVin(Integer vin){
       return entityManager.find(Car.class,vin);
    }


    public List<Car> selectAll(){
        return entityManager.createQuery("from Car").getResultList();

    }


    public void delete(int vin) {
        Car car = entityManager.find(Car.class,vin);
        entityManager.remove(car);
    }
}
