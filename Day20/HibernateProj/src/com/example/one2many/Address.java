package com.example.one2many;

import javax.persistence.*;

@Entity
@Table(name = "address_detail")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 20,nullable = false)
    String city;

    @Column(length = 20,nullable = false)
    String state;

    public Address(int id, String city, String state) {
        this.id = id;
        this.city = city;
        this.state = state;
    }
    public Address() {

    }
    public Address( String city, String state) {

        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
