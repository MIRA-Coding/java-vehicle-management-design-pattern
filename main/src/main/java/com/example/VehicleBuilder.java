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