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
