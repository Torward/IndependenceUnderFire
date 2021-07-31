package ru.lomov.game;

import com.badlogic.gdx.Game;

import ru.lomov.game.screen.MenuScreen;

public class IndependenceUnderFire extends Game {


    @Override
    public void create() {
        setScreen(new MenuScreen());
    }
}
//        Vector2 v1 = new Vector2(3, 3);
//        Vector2 v2 = new Vector2();
//        v2.set(2,1);
//        v1.add(v2);//сложение векторов
//        v1.set(7,7);
//        v2.set(2,1);
//        v1.sub(v2);//вычитание векторов для определения расстояния до точки
//        v1.scl(0.9f);//скалирование вектора
//        v1.nor();//нормализация вектора, приведение его к еденице
//        v2.cpy().add(v1);//работа с копеей вектора. Метод нельзя вызывать из многократных методов(render)
//        v1.set(1,1);
//        v2.set(-1, 1);
//        v1.nor();
//        v2.nor();
//        Math.acos(v1.dot(v2));// радиант(скалярное произведение векторов)