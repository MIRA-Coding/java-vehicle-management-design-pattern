package com.example;


/**
 *
 * @author amera mohsen
 */
public class Drone implements Vehicle {
    private final String id;

    public Drone(String id) {
        this.id = id;
    }

    @Override
    public void drive() {
        System.out.println("Flying drone: " + id);
    }

    @Override
    public Vehicle clone() {
        return new Drone(id);
    }
}