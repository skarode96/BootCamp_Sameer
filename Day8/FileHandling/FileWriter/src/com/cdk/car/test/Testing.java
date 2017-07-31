package com.cdk.car.test;

import com.cdk.car.Car;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by karodes on 7/27/2017.
 */
public class Testing {
    @Test
    public void test1() {
//        System.out.println("=================Default comparison by price===============");
        HashSet<Car> carSet = Car.createCarData();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carSet);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\karodes\\Documents\\CdkTraining\\FileHandling\\FileWriter\\src\\com\\cdk\\car\\test\\carlist.txt");
            Iterator<Car> itr = carList.iterator();
            while (itr.hasNext()) {
                Car car = itr.next();
                fileWriter.write(car.getBrand() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
