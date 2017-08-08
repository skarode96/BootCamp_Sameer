package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_XML_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

    @RequestMapping(value = "car",produces = "text/plain", method = RequestMethod.GET)
    public String readCar() {
        return "vin- 100, model-Q7, make-Audi, price:780000000.00, qty-10";
    }

    @RequestMapping(value = "car",produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXml(){
        Car car = carDAO.selectByVin(1200);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }
    @RequestMapping(value = "cars",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Collection<Car> selectAll(){
        Collection<Car> cars = carDAO.selectAll();
        return cars;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }
    @RequestMapping(value = "car/update/{vin}",produces = "text/plain",consumes = APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public String updateCar(@PathVariable(value = "vin") int vin,@RequestBody Car car){
        System.out.println(car);
        car.setVin(vin);
        return carDAO.update(vin,car);
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }


    @RequestMapping(value = "car/add",produces = "text/plain", consumes = APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public String addCar(@RequestBody Car[] car){
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
            int value = carDAO.insertCar(car[i]);
            System.out.println("Car with" + value + " added succesfully");
        }
        return "Multiple Cars added succesfully";
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }


    @RequestMapping(value = "car",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJson(){
        Car car = carDAO.selectByVin(1300);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }

    @RequestMapping( value = "car/{vin}",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJsonByVin(@PathVariable(value = "vin") Integer vin){
         Car car = carDAO.selectByVin(vin);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }

    @RequestMapping( value = "car/delete/{vin}",produces = "text/plain" ,method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable(value = "vin") Integer vin){
        return carDAO.deleteCar(vin);
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }

}
