package com.example;

/**
 *
 * @author amera mohsen
 */
public class VehicleBuilder {
    private String type;
    private String spec;

    public VehicleBuilder setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        this.type = type;
        return this;
    }

    public VehicleBuilder setSpec(String spec) {
        if (spec == null || spec.isEmpty()) {
            throw new IllegalArgumentException("Spec cannot be null or empty");
        }
        this.spec = spec;
        return this;
    }

    public Vehicle build() {
        try {
            Vehicle vehicle = new VehicleFactory().createVehicle(type, spec);
            System.out.println("Vehicle created: " + type);
            return vehicle; // No need for null check since factory throws 
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Failed to build vehicle: " + e.getMessage(), e);
        }
    }
}