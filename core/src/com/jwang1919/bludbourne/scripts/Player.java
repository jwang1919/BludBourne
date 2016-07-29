package com.jwang1919.bludbourne.scripts;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.uwsoft.editor.renderer.components.TransformComponent;
import com.uwsoft.editor.renderer.scripts.IScript;
import com.uwsoft.editor.renderer.utils.ComponentRetriever;

/**
 * Created by jwang1919 on 7/28/2016.
 */
public class Player implements IScript {

    private Entity entity;
    private TransformComponent transformComponent;
    private static final float X_SPEED = 100F;

    @Override
    public void init(final Entity entity) {
        this.entity = entity;
        transformComponent = ComponentRetriever.get(entity, TransformComponent.class);
    }

    @Override
    public void act(final float delta) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            transformComponent.x -= X_SPEED * delta;
            transformComponent.scaleX = -1F;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            transformComponent.x += X_SPEED * delta;
            transformComponent.scaleX = 1F;
        }
    }

    @Override
    public void dispose() {

    }
}
