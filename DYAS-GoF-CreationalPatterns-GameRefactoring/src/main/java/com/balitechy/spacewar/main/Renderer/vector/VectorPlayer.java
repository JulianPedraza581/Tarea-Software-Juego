package com.balitechy.spacewar.main.Renderer.vector;

import java.awt.Graphics;
import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Player;

public class VectorPlayer extends Player {

    public VectorPlayer(Game game, double x, double y) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        // Delegamos el renderizado al VectorPlayerRenderer
        VectorPlayerRenderer.renderPlayer(g, x, y);
    }
}
