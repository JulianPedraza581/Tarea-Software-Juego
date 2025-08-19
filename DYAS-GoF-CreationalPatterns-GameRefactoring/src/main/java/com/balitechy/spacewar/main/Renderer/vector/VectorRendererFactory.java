package com.balitechy.spacewar.main.Renderer.vector;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.IBackgroundRenderer;
import com.balitechy.spacewar.main.Renderer.BulletRenderer;
import com.balitechy.spacewar.main.Renderer.PlayerRenderer;
import com.balitechy.spacewar.main.Renderer.RendererFactory;

public class VectorRendererFactory implements RendererFactory {

    @Override
    public PlayerRenderer createPlayerRenderer(Game game) {
        return null;
    }

    @Override
    public BulletRenderer createBulletRenderer() {
        return new VectorBulletRenderer(null, 0, 0);
    }

    @Override
    public IBackgroundRenderer createBackgroundRenderer() {
        return new VectorBackgroundRenderer(null);
    }
}
