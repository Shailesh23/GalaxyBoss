package com.bossy.galactic.shal

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import javax.xml.soap.Text

class Galaxy : Game() {
    lateinit var batch: SpriteBatch

    lateinit var rocketImage : Texture
    lateinit var metoriteType1 : Texture
    lateinit var metoriteType2 : Texture

    override fun create() {
        batch = SpriteBatch()

        //load asset images
        rocketImage = Texture("flying_rocket.png")
        metoriteType1 = Texture("meteorite_type_1.png")
        metoriteType2 = Texture("meteorite_type_1.png")

        setScreen(GalaxyScreen(this))
    }

    override fun render() {
        //paint screen white
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)


        batch.begin()
        batch.draw(rocketImage, 0f, 0f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        //clear resources
        rocketImage.dispose()
        metoriteType1.dispose()
        metoriteType2.dispose()
    }
}
