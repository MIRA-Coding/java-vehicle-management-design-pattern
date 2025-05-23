
package com.example;

/**
 *
 * @author amera mohsen
 */
interface Renderer {
    void render(String text);
}

class AsciiRenderer implements Renderer {
    public void render(String text) {
        System.out.println("[ASCII] " + text);
    }
}
