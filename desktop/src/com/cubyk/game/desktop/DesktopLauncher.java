package com.cubyk.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cubyk.game.FishEscape;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title =FishEscape.TITLE;
		config.width = FishEscape.WIDTH;
		config.height = FishEscape.HEIGHT;
		new LwjglApplication(new FishEscape(), config);
	}
}
