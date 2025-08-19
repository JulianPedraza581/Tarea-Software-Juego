package com.balitechy.spacewar.main.Renderer.vector;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Renderer.BulletRenderer;

// VectorBulletRenderer.java
public class VectorBulletRenderer implements BulletRenderer {
    private double x;
    private double y;
    private Game game;

    public VectorBulletRenderer(Game game, double x, double y) {
        this.game = game;
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.WHITE);
        g.fillOval((int) x, (int) y, Bullet.WIDTH, Bullet.HEIGHT);
    }
}
