package com.company;

public class Terrain {
    public int x;
    public int y;
//    private int x;
//    private int y;
    private String state;

    public Terrain(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return state;
    }

    public void setState(String str) {
        this.state = str;
    }
}
