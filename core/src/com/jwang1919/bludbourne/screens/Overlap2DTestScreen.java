package com.jwang1919.bludbourne.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;

/**
 * Created by jwang1919 on 7/26/2016.
 */
public class Overlap2DTestScreen extends ScreenAdapter {

    private SceneLoader sceneLoader;

    @Override
    public void show() {
        final Viewport viewport = new FitViewport(267F, 160F);
        sceneLoader = new SceneLoader();
        sceneLoader.loadScene("MainScene", viewport);
    }

    @Override
    public void render(final float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sceneLoader.getEngine().update(delta);
    }

    @Override
    public void dispose() {
    }
}
