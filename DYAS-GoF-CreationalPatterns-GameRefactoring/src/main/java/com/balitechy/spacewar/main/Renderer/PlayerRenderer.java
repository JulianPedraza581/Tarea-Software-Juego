// PlayerRenderer.java
package com.balitechy.spacewar.main.Renderer;

import java.awt.Graphics;

public interface PlayerRenderer {
    void render(Graphics g, double x, double y);

    void setVelX(int i);

    void setVelY(int i); // <-- agregar esto

}
