package com.company.test;

import com.company.car.Car;
import com.company.comparators.BrandComparator;
import com.company.comparators.IdComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by karodes on 7/25/2017.
 */
public class Testing {
    @Test
    public void test1(){
        System.out.println("=================Default comparison by price===============");
        TreeSet<Car> carSet = Car.createCarData();
        ArrayList<Car> listOfCar = new ArrayList<Car>();
        listOfCar.addAll(carSet);
        Collections.sort(listOfCar);
        Iterator<Car> iterator = listOfCar.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

        System.out.println("==============Comparison by Brand=======================");
//        carSet = Car.createCarData(new BrandComparator());
//        TreeSet<Car> myTreeSet = new TreeSet<>();
//        myTreeSet.addAll(carSet);
        Collections.sort(listOfCar,new BrandComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

        System.out.println("==============Comparison by Id=======================");
//        carSet = Car.createCarData(new IdComparator());
        Collections.sort(listOfCar,new IdComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }


    }
}
