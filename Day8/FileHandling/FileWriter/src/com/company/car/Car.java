package com.company.car;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.HashSet;


/**
 * Created by karodes on 7/25/2017.
 */
public class Car implements Comparable,Serializable {
    int id;
    String brand;
    double price;

    public Car(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static HashSet<Car> createCarData() {
        HashSet<Car> listOfCar = new HashSet<Car>();
        listOfCar = getSet(listOfCar);
        return listOfCar;
    }

    private static HashSet<Car> getSet(HashSet<Car> listOfCar) {

        listOfCar.add(new Car(23,"Ferrari",1000432200));
        listOfCar.add(new Car(24,"Maruti",1000));
        listOfCar.add(new Car(25,"Lamborghini",303420000));
        listOfCar.add(new Car(26,"Mercedes",345000));
        listOfCar.add(new Car(27,"Murceilago",234000));
        listOfCar.add(new Car(28,"Avantador",10230000));
        listOfCar.add(new Car(29,"Jaguar",13034000));
        listOfCar.add(new Car(30,"Maruti",2500));
        listOfCar.add(new Car(31,"Tata",4000));
        listOfCar.add(new Car(32,"Suzuki",8000));
        listOfCar.add(new Car(33,"Mahindra",2000));
        listOfCar.add(new Car(34,"Bmw",10340000));
        listOfCar.add(new Car(35,"Aston Martin",104230000));
        listOfCar.add(new Car(36,"Audi",103340000));
        listOfCar.add(new Car(37,"Bentley",32100000));
        listOfCar.add(new Car(38,"Buggati",345100000));
        listOfCar.add(new Car(39,"Acura",531000));
        listOfCar.add(new Car(40,"Buick",1034000));
        listOfCar.add(new Car(41,"Honda City",10450));
        listOfCar.add(new Car(42,"Hyundai",12300));
        listOfCar.add(new Car(43,"Alfa Romeo",1000));
        return listOfCar;

    }

    @Override
    public int compareTo(@NotNull Object o) {
        return (int) (((Car)o).getPrice()-this.getPrice());
    }
}
