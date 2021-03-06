package com.cubyk.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FishEscape extends ApplicationAdapter {

	public static  final int WIDTH = 480;
	public static  final int HEIGHT = 320;

	public static final String TITLE = "Fish Escape";

	SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		batch.end();
	}
}
