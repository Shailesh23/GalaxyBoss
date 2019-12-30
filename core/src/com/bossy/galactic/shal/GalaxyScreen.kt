package com.bossy.galactic.shal

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera

class GalaxyScreen(val galaxy: Galaxy) : Screen {

    val orthographicCamera = OrthographicCamera()

    init {
        orthographicCamera.setToOrtho(false, 400f, 800f)
    }

    override fun hide() {

    }

    override fun show() {
    }

    override fun render(delta: Float) {
        //paint screen white
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        orthographicCamera.update()

        galaxy.batch.begin()
        galaxy.batch.draw(galaxy.rocketImage, 400f, 400f)
        galaxy.batch.end()
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun dispose() {
    }
}