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