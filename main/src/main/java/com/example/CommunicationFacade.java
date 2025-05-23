
package com.example;

/**
 *
 * @author amera mohsen
 */
class GPS {
    void locate(String s) { System.out.println("GPS locating... for "+s); }
}

class AI {
    void planRoute(String s) { System.out.println("AI planning route... for " +s); }
}

class Engine {
    void start(String s) { System.out.println("Engine started. for " +s); }
}


//Add error handling and logging

public class CommunicationFacade {
    private GPS gps = new GPS();
    private AI ai = new AI();
    private Engine engine = new Engine();

    public void prepareForTrip(String s) {
        try {
            System.out.println("[LOG] Preparing for trip: " + s);
            gps.locate(s);
            ai.planRoute(s);
            engine.start(s);
            System.out.println("[LOG] Trip preparation completed for: " + s+"\n");
        } catch (Exception e) {
            System.err.println("[ERROR] Failed to prepare for trip: " + e.getMessage());
        }
    }
}
