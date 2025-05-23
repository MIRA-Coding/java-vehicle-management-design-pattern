
package com.example;

/**
 *
 * @author amera mohsen
 */
public class RemoteVehicleProxy implements Vehicle {
    private Vehicle realVehicle;
    private boolean authorized;

    public RemoteVehicleProxy(Vehicle v, boolean authorized) {
        this.realVehicle = v;
        this.authorized = authorized;
    }

    public void drive() {
        System.out.println("\nAttempting to drive vehicle: "+ realVehicle.getClass().getSimpleName()+">>>");
        if (authorized) realVehicle.drive();
        else System.out.println("Access Denied X_X ");
    }

    public Vehicle clone() {
        return new RemoteVehicleProxy(realVehicle.clone(), authorized);
    }
}
