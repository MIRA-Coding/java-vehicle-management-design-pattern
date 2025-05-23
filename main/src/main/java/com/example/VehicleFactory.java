package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author amera mohsen
 */
public class VehicleFactory {
    private Map<String, Class<? extends Vehicle>> registry = new HashMap<>();

    // Initialize registry with supported vehicle types
    public VehicleFactory() {
        registerVehicle("car", Car.class);
        registerVehicle("drone", Drone.class);
        registerVehicle("truck", Truck.class);
    }

    public void registerVehicle(String type, Class<? extends Vehicle> vehicleClass) {
        registry.put(type.toLowerCase(), vehicleClass);
    }

    public Vehicle createVehicle(String type, String spec) {
        try {
            Class<? extends Vehicle> vehicleClass = registry.get(type.toLowerCase());
            if (vehicleClass == null) {
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
            }

            // Handle different constructor based on vehicle type
            if (vehicleClass == Car.class) {
                return new Car(spec, 4);
            }
            
            else if (vehicleClass == Truck.class) {
                return new Truck(spec, 5.0);
            } 
            
            else {
                return vehicleClass.getConstructor(String.class).newInstance(spec);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to create vehicle: " + e.getMessage(), e);
        }
    }
}