/*
 * MIT License
 *
 * Copyright (c) 2025 Amera Mohsen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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