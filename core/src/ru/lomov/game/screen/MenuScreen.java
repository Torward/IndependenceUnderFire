package ru.lomov.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.lomov.game.base.BaseScreen;

public class MenuScreen  extends BaseScreen {

    private Texture img;
    private Texture fon;
    private int x = 0;
    private int y = 0;
    private int w = 256;
    private int h = 256;
    private int fw = 600;
    private int fh = 600;
    private Vector2 pos;
    private Vector2 vel;

    @Override
    public void show() {
        super.show();
        fon = new Texture("cosmos.jpg");
        img = new Texture("ufo .png");
        pos = new Vector2();
        vel = new Vector2(1,1);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
      // pos.y++;
       // pos.x++;
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
        batch.begin();
        batch.draw(fon, 0, 0,fw,fh);
        batch.draw(img, pos.x, pos.y, w, h);
        batch.end();
        pos.add(vel);
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
        fon.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        pos.set(screenX, Gdx.graphics.getHeight()-screenY);
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        pos.set(screenX, Gdx.graphics.getHeight()-screenY);
        return super.touchDragged(screenX, screenY, pointer);
    }
}
