package com.sameer.ideexercise;

/**
 * Created by karodes on 7/21/2017.
 */
public class PetStore {
    private int id;
    String name;
    private String description;

    @Override
    public String toString() {
        return "PetStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PetStore(int id, String name, String descriptio) {

        this.id = id;
        this.name = name;
        this.description = description;
    }

}
