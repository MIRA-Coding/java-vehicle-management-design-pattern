package com.example;

//enum to ensure a single instance, inherently safe against reflection and serialization issues.
//Replace VehicleManager.getInstance() with VehicleManager.INSTANCE
/**
 *
 * @author amera mohsen
 */
public enum VehicleManager {
    INSTANCE;

    public void manage(Vehicle v) {
        System.out.print("Managing: ");
        v.drive();
    }
}