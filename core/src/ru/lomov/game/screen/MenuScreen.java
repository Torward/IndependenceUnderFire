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
    private int w = 128;
    private int h = 128;
    private int fw = 600;
    private int fh = 600;
    private Vector2 pos;
    private Vector2 vel;
    private Vector2 posA;
    private Vector2 mov;
    private Vector2 dir;

    @Override
    public void show() {
        super.show();
        fon = new Texture("cosmos.jpg");
        img = new Texture("ufo .png");
        pos = new Vector2();
        posA = new Vector2();
        mov = new Vector2(0,0);
        vel = new Vector2();
        dir = new Vector2();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.enableBlending();
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(fon, 0, 0,fw,fh);
        batch.draw(img, pos.x, pos.y, w, h);
        batch.end();
        if(pos.dst2(posA)> vel.dst2(dir)){
            pos.add(vel);
        } else {
            pos.set(posA);

        }




    }
    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
        fon.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        posA.set(screenX-64, Gdx.graphics.getHeight()-screenY-64);
       dir.set(posA).sub(pos).nor();
       vel = new Vector2(dir).scl(5);


        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        pos.set(screenX, Gdx.graphics.getHeight()-screenY);
        dir.set(posA).sub(pos).nor();
        vel = new Vector2(dir).scl(5);
        return super.touchDragged(screenX, screenY, pointer);
    }
    public void resetPos(Vector2 pos){
        this.pos = pos;
        pos.set(0,0);
    }
}
