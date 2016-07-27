package com.jwang1919.bludbourne.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jwang1919.bludbourne.BludBourne;
import com.jwang1919.bludbourne.helpers.GameConstants;

public class DesktopLauncher {
	public static void main (final String[] arg) {
		final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = GameConstants.TITLE;
        config.width = GameConstants.GAME_WIDTH;
        config.height = GameConstants.GAME_HEIGHT;

		new LwjglApplication(new BludBourne(), config);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
    }
}
