package com.company.DuplicateFinder;

import com.company.person.Person;

import java.util.HashMap;
import java.util.List;

/**
 * Created by karodes on 7/20/2017.
 */
public class DuplicateFinder {

    public static void getDuplicateNames() {
        List<Person> listOfPerson = Person.getListOfPerson();
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        for(Person person : listOfPerson) {
            if (!hashMap.containsKey(person.getName()))
                hashMap.put(person.getName(), 1);
            else {
                int currentValue = hashMap.get(person.getName());
                hashMap.put(person.getName(), ++currentValue);
            }
        }
        for(String keySet: hashMap.keySet()) {
            System.out.println("Occurence of " + keySet + " : " + hashMap.get(keySet));
        }
    }

}
