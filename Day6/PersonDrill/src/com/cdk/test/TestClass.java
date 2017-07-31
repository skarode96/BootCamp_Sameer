package com.cdk.test;

import com.cdk.DuplicateFinder.DuplicateFinder;
import com.cdk.Gender.Gender;
import com.cdk.person.Person;
import com.sun.org.apache.bcel.internal.generic.DUP;
import org.junit.Test;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/20/2017.
 */
public class TestClass {

    @Test
    public void test1() {
        List<Person> listOfPerson = Person.getListOfPerson();
        System.out.println("-----Populating List-----------");
        for(Person person : listOfPerson) {
            System.out.println(person.toString());
        }
        System.out.println("--------------------------------");
        DuplicateFinder.getDuplicateNames();
    }
    @Test
    public void test2() {
        List<Person> listOfPerson = Person.getListOfPerson();
        System.out.println("Hashcode debugging");
        for(Person person : listOfPerson) {
            System.out.println(person.toString() + " HashCode : " + person.hashCode());
        }

    }
    @Test
    public void test3() {
        Person person1 = new Person("Sameer", Gender.MALE);
        Person person2 = new Person("Sameer",Gender.MALE);
        Person person3 = new Person("Ritesh",Gender.MALE);
        System.out.println(person1.equals(person2));
        System.out.println("HashCode of " + person1.toString() + " is : " + person1.hashCode());
        System.out.println("HashCode of " + person2.toString() + " is : " + person2.hashCode());
        System.out.println("HashCode of " + person3.toString() + " is : " + person3.hashCode());

    }
}
