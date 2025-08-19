package com.balitechy.spacewar.main.Renderer;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Renderer.sprite.SpriteRendererFactory;
import com.balitechy.spacewar.main.Renderer.vector.VectorGameElementFactory;
import com.balitechy.spacewar.main.Renderer.vector.VectorRendererFactory;

public class RendererFactoryLoader {

    public enum FactoryType { SPRITE, VECTOR }

    private static RendererFactory rendererFactory;
    private static GameElementFactory elementFactory;

    public static void loadFactory(FactoryType type, Game game) {
        switch (type) {
            case SPRITE:
                rendererFactory = new SpriteRendererFactory(game);
                elementFactory = new SpriteGameElementFactory();
                break;
            case VECTOR:
                rendererFactory = new VectorRendererFactory();
                elementFactory = new VectorGameElementFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de fábrica no soportado: " + type);
        }
    }

    public static RendererFactory getFactory() {
        return rendererFactory;
    }

    public static GameElementFactory getElementFactory() {
        return elementFactory;
    }
}
