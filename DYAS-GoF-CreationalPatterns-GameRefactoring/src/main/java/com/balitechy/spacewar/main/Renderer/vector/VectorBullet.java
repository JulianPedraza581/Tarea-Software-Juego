package com.balitechy.spacewar.main.Renderer.vector;

import java.awt.Graphics2D;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.Game;

public class VectorBullet extends Bullet {

    public VectorBullet(Game game, double x, double y) {
        super(x, y, game);
    }

    @Override
    public void draw(Graphics2D g) {
        g.fillRect((int) x, (int) y, WIDTH, HEIGHT); // Aquí puedes hacer triángulo más adelante

    }
}
