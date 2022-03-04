package com.company;

public class Humanoid {
    int x;
    int y;

    public Humanoid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void corectMove(){

        if(x > Map.dim-1){
            this.x = Map.dim-1;
        }
        if(x < 0){
            this.x = 0;
        }

        if(y > Map.dim-1){
            this.y = Map.dim -1;
        }

        if(y <= 0){
            this.y = 0;
        }

    }

    public Humanoid moveNorth(){
        this.x -=1;
        corectMove();
        return this;
    }

    public Humanoid moveSouth(){
        this.x += 1;
        corectMove();
        return this;
    }

    public Humanoid moveEast(){
        this.y += 1;
        corectMove();
        return this;
    }

    public Humanoid moveWest(){
        this.y -= 1;
        corectMove();
        return this;
    }

}
