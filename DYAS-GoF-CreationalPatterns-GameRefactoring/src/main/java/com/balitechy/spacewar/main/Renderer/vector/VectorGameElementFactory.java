package com.balitechy.spacewar.main.Renderer.vector;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.IBackgroundRenderer;
import com.balitechy.spacewar.main.Player;
import com.balitechy.spacewar.main.Renderer.GameElementFactory;

public class VectorGameElementFactory implements GameElementFactory {

    @Override
    public Player createPlayer(Game game) {
        return new VectorPlayer(game, 100, 400);
    }

    @Override
    public Bullet createBullet(Game game, double x, double y) {
        return new VectorBullet(game, x, y);
    }

    @Override
    public IBackgroundRenderer createBackgroundRenderer(Game game) {
        return new VectorBackgroundRenderer(game);
    }
}
