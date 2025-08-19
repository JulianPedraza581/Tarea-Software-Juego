package com.balitechy.spacewar.main.Renderer.sprite;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Player;
import com.balitechy.spacewar.main.Renderer.PlayerRenderer;
import com.balitechy.spacewar.main.SpritesImageLoader;

public class SpritePlayerRenderer extends Player implements PlayerRenderer {

    private BufferedImage sprite;

    public SpritePlayerRenderer(double x, double y, Game game,
                                SpritesImageLoader loader,
                                int top, int left, int width, int height) {
        super(x, y, game);
        try {
            this.sprite = loader.getImage(top, left, width, height);
        } catch (Exception e) {
            e.printStackTrace();
            this.sprite = null;
        }
    }

    @Override
    public void render(Graphics g, double x, double y) {
        if (sprite != null) {
            g.drawImage(sprite, (int)x, (int)y, WIDTH, HEIGHT, null);
        } else {
            g.setColor(java.awt.Color.RED);
            g.fillRect((int)x, (int)y, WIDTH, HEIGHT);
        }
    }

    @Override
    public void render(Graphics g) {
        render(g, getX(), getY());
    }

    @Override
    public void setVelX(int i) {
        super.setVelX((double)i);
    }

    public void setVelY(int i) {
        super.setVelY((double)i);
    }
}
