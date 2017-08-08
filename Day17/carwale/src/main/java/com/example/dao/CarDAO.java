package com.example.dao;


import com.example.model.Car;
import org.springframework.stereotype.Repository;

//This class is going to talk with database

@Repository
public class CarDAO {
    public Car selectByVin(int vin){
        //JDBC Logic
        return new Car(1200,"X5","BMW",123999.00,"Black",1);
    }
}
