package ru.lomov.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.profiling.GL20Interceptor;
import com.badlogic.gdx.utils.ScreenUtils;

public class IndependenceUnderFire extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    Texture fon;
    private int x = 0;
    private int y = 0;
    private int w = 256;
    private int h = 256;
    private int fw = 600;
    private int fh = 600;

    private TextureRegion region;

    @Override
    public void create() {
        batch = new SpriteBatch();
        fon = new Texture("cosmos.jpg");
        img = new Texture("ufo .png");
        //region = new TextureRegion(img, 125, 125, 50, 50);
    }

    @Override
    public void render() {
        y++;
        x++;
        if (h <= 256) {
            w--;
            h--;

        }
        if (h <= 0) {
            w = 2;
            h = 2;
        }
        batch.enableBlending();
        ScreenUtils.clear(1, 0, 0, 1);
        //batch.setColor(0f,0f,0f,0.3f);
        batch.begin();
        batch.draw(fon, 0, 0,fw,fh);
        batch.draw(img, x, y, w, h);
        //batch.draw(region, 125,125);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
