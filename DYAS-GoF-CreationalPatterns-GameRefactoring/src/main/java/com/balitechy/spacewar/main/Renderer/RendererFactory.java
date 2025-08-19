package com.balitechy.spacewar.main.Renderer;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.IBackgroundRenderer;

public interface RendererFactory {
    PlayerRenderer createPlayerRenderer(Game game);
    BulletRenderer createBulletRenderer();
    IBackgroundRenderer createBackgroundRenderer();
}
