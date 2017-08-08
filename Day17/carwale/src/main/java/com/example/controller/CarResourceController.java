package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.xml.bind.JAXB;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON;
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
        Car car = carDAO.selectByVin(1000);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }

    @RequestMapping(value = "car",produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJson(){
        Car car = carDAO.selectByVin(1000);
        return car;
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }



}
