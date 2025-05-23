package com.example;


/**
 *
 * @author amera mohsen
 */
// 1. Product Interface
public interface Vehicle extends Cloneable {
    void drive();
    Vehicle clone();
}
