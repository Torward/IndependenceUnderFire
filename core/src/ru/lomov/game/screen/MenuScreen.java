package ru.lomov.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.lomov.game.base.BaseScreen;
import ru.lomov.game.gameObject.PersShip;

public class MenuScreen  extends BaseScreen {

    private Texture shipTexture;
   // private Texture fon;
    private PersShip ship;
//    private int x = 0;
//    private int y = 0;
//    private int w = 128;
//    private int h = 128;
//    private int fw = 600;
//    private int fh = 600;
    private Vector2 pos;
    private Vector2 vel;
    private Vector2 posA;
    private Vector2 dir;

    @Override
    public void show() {
        super.show();
        //fon = new Texture(Gdx.files.internal("cosmos.jpg"));
        shipTexture = new Texture("ufo .png");
        ship = new PersShip(shipTexture, 0, 0, 0.3f,0.3f);
        pos = new Vector2();
        posA = new Vector2();
        vel = new Vector2();
        dir = new Vector2();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        //batch.enableBlending();
        batch.begin();
        ship.draw(batch);
       // batch.draw(fon, 0, 0,1f,1f);
        //batch.draw(img, pos.x, pos.y, 0.5f, 0.5f);
        batch.end();
//        if(pos.dst2(posA)> vel.dst2(dir)){
//            pos.add(vel);
//        } else {
//            pos.set(posA);
//
//        }




    }
    @Override
    public void dispose() {
        super.dispose();
        //img.dispose();
        //fon.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        posA.set(screenX-0.15f, Gdx.graphics.getHeight()-screenY-0.15f);
       dir.set(posA).sub(pos).nor();
       vel = new Vector2(dir).scl(1.8f);
       return false;
    }

//    @Override
//    public boolean touchDragged(int screenX, int screenY, int pointer) {
//        pos.set(screenX, Gdx.graphics.getHeight()-screenY);
//        dir.set(posA).sub(pos).nor();
//        vel = new Vector2(dir).scl(5);
//        return false;
//    }
}
