package ru.lomov.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class IndependenceUnderFire extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    private int x = 0;
    private int y = 0;
    private int w = 256;
    private int h = 256;
    private TextureRegion region;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        region = new TextureRegion(img, 125, 125, 50, 50);
    }

    @Override
    public void render() {
        y++;
        x++;
        if(h<=256){
            w--;
        h--;

        }



        ScreenUtils.clear(1, 3, 0, 1);
        batch.begin();
        //batch.draw(img, x, y);
        batch.draw(img, x, y, w, h);
        //batch.draw(region, 125,125);
        //batch.setColor();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
