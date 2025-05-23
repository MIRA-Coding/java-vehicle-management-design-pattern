package com.example;


//Deep cloning ensures independent copies, reset allows reuse, and Serializable supports persistence.
//Ensure deep cloning for complex objects, add a reset method, and implement Serializable.

/**
 *
 * @author amera mohsen
 */
public class Truck implements Vehicle, java.io.Serializable {
    private final String model;
    private final double payloadCapacity;

    public Truck(String model, double payloadCapacity) {
        this.model = model;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving a truck: " + model + " with payload capacity " + payloadCapacity + " tons.");
    }

    @Override
    public Vehicle clone() {
        return new Truck(this.model, this.payloadCapacity); 
    }

}