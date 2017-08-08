package com.example.dao;


import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//This class is going to talk with database

@Repository
public class CarDAO {
    Map<Integer,Car> cars = null;
    @PostConstruct
    void init(){
        cars = new HashMap<Integer, Car>();
        cars.put(1000,new Car(1000,"X5","Jaguar",123999.00,"Black",1));
        cars.put(1001,new Car(1001,"Q7","Lamborghini",3999.00,"Blue",1));
        cars.put(1002,new Car(1002,"Z5","BMW",1999.00,"Green",1));
        cars.put(1003,new Car(1003,"M8","Audi",999.00,"Yellow",1));
        cars.put(1004,new Car(1004,"T5","Tesla",123232999.00,"Black",1));
    }

    public Car selectByVin(Integer vin){
        //JDBC Logic
        return cars.get(vin);
    }
    public int insertCar(Car car){
        int id = cars.size()+1000;
        car.setVin(id);
        cars.put(id,car);
        return id;
    }
    @PreDestroy
    void destroy(){
        cars.clear();
        cars = null;
    }

    public Collection<Car> selectAll() {
        return cars.values();
    }

    public String update(int vin,Car car) {

        cars.put(vin,car);
        return "car with vin " + vin +" updated.";
    }
    public String deleteCar(int vin) {
        cars.remove(vin);
        return "car with vin " + vin +" removed !!";
    }

}
