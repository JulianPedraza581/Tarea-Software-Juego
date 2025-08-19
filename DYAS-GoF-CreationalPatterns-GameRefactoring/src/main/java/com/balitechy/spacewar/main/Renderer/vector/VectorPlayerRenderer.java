package com.balitechy.spacewar.main.Renderer.vector;

import java.awt.Graphics;

public class VectorPlayerRenderer {

    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;

    // Método estático para dibujar un jugador en la posición x, y
    public static void renderPlayer(Graphics g, double x, double y) {
        int[] xPoints = {(int)x, (int)(x + WIDTH), (int)(x + WIDTH/2)};
        int[] yPoints = {(int)(y + HEIGHT), (int)(y + HEIGHT), (int)y};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
