package com.example;

/**
 *
 * @author amera mohsen
 */
// 2. Concrete Products
public class Car implements Vehicle {
    private final  String model;
    private  final int seats;

    public Car(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car: " + model + " with " + seats + " seats.");
    }

    @Override
    public Vehicle clone() {
        return new Car(this.model, this.seats);
    }
}
 