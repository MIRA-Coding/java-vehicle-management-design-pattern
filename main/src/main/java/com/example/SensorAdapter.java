
package com.example;

/**
 *
 * @author amera mohsen
 */
interface Sensor {
    void read(String s);
}

public class SensorAdapter implements Sensor {
    private LagecySensor legacy;

    public SensorAdapter(LagecySensor legacy) {
        this.legacy = legacy;
    }

    public void read(String s) {
        legacy.oldRead(s);
    }
}
