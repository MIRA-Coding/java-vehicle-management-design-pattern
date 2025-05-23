
package com.example;

/**
 *
 * @author amera mohsen
 */
    public class LoggingProxy implements Vehicle {
    private final Vehicle real;

    public LoggingProxy(Vehicle real) {
        this.real = real;
    }

    public void drive() {
        System.out.println("[LOG] Driving started.");
        real.drive();
        System.out.println("[LOG] Driving ended.");
    }

    public Vehicle clone() {
        return new LoggingProxy(real.clone());
    }
}


