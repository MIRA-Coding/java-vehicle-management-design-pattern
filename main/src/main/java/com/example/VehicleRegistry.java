/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.*;
/**
 *
 * @author amera mohsen
 */


// 5. Prototype Registry
public class VehicleRegistry {
    private Map<String, Vehicle> prototypes = new HashMap<>();

    public void register(String key, Vehicle v) {
        prototypes.put(key, v);
        System.out.println("Vehicle registered: " + key);
    }

    public Vehicle get(String key) {
        Vehicle v = prototypes.get(key);
        return v != null ? v.clone() : null;
    }
}
