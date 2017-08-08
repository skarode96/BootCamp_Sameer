package com.example.model;

//import org.codehaus.jackson.annotate.JacksonAnnotation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Car {

    int vin;
    String name;
    String make;
    double price;
    String color;
    int qty;

    public Car() {
    }

    public Car(int vin, String name, String make, double price, String color, int qty) {
        this.vin = vin;
        this.name = name;
        this.make = make;
        this.price = price;
        this.color = color;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (vin != car.vin) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (qty != car.qty) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + qty;
        return result;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    @XmlTransient
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
