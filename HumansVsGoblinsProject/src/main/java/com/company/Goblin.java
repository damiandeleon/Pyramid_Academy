package com.company;

import java.util.Random;

public class Goblin extends Humanoid {


    public Goblin(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "👺";
    }

    public void moveGoblin(int x, int y, int xx, int yy){
        int oldPosX = x;
        int oldPosY =y;
        Map map = new Map(5);

        if(yy < y) {
            moveWest();
        }
        if(xx < x){
            moveNorth();
        }
        if(yy > y){
            moveEast();
        }
        if (xx > x){
            moveSouth();
        }
    }
}
