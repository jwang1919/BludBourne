package com.jwang1919.bludbourne;

import com.badlogic.gdx.Game;
import com.jwang1919.bludbourne.screens.Overlap2DTestScreen;
import com.jwang1919.bludbourne.screens.Overlap2DTileScreen;
import com.jwang1919.bludbourne.screens.TestScreen;

public class BludBourne extends Game {

	@Override
	public void create () {
		// Will implement real screen later
		setScreen(new Overlap2DTileScreen());
	}

	@Override
	public void dispose () {
	}
}
