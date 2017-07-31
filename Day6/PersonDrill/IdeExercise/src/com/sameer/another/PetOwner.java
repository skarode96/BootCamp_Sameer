package com.sameer.another;

import java.util.Map;

/**
 * Created by karodes on 7/21/2017.
 */
public class PetOwner {
    String name;
    int age;

    public PetOwner(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetOwner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
