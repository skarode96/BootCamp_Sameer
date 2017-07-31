package com.cdk.person;

import com.cdk.Gender.Gender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/20/2017.
 */
public class Person {
    String name;
    Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public boolean equals(Object obj) {
        if(((Person)obj).getName() == this.getName())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
    public static List<Person> getListOfPerson() {
        ArrayList<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("Sameer",Gender.MALE));
        listOfPerson.add(new Person("Mahesh",Gender.MALE));
        listOfPerson.add(new Person("Sneh",Gender.MALE));
        listOfPerson.add(new Person("Sameer",Gender.MALE));
        listOfPerson.add(new Person("Nitesh",Gender.MALE));
        listOfPerson.add(new Person("Nitesh",Gender.FEMALE));
        listOfPerson.add(new Person("Nitesh",Gender.FEMALE));
        listOfPerson.add(new Person("Sneh",Gender.FEMALE));
        return listOfPerson;
    }
}
