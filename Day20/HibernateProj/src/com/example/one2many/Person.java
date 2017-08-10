package com.example.one2many;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="person_detail")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;

    @Column(length = 20,nullable = false)
    String name;

    @Column(length = 10,nullable = false)
    String phone;

    int age;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    Set<Address> addresses = new HashSet<>();

    public Person() {
    }
    public Person(String name, String phone, int age) {

        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public Person(int uid, String name, String phone, int age) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
