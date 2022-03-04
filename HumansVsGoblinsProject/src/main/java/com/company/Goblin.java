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
//        Random rand = new Random();
//        int rand_choice = rand.nextInt(4);
        int oldPosX = x;
        int oldPosY =y;
        Map map = new Map(5);

        if(yy < y) {
            moveWest();
//            if(y > map.dim-1){
//                y -=2;
//            }
        }
        if(xx < x){
            moveNorth();
//            if(x > map.dim-1){
//                x+=2;
//            }
        }
        if(yy > y){
            moveEast();
//                if(x > map.dim-1){
//                    x-=2;
//                }
        }
        if (xx > x){
            moveSouth();
//                if(y > map.dim-1){
//                    y +=2;
//                }
        }
//        System.out.println("Random Choice: " + rand_choice);
//        switch (rand_choice){
//            case 0:
////                System.out.println("Old Goblin Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
//                moveNorth();
//                if(x > map.dim-1){
//                    x+=2;
//                }
////                map.updateState();
////                System.out.println("New Goblin Position coordinates: [" + x + ", " + y + ']');
//
//                break;
//            case 1:
////                System.out.println("Old Goblin Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
//                moveEast();
//                if(x > map.dim-1){
//                    x-=2;
//                }
////                map.updateState();
////                System.out.println("New Goblin Position coordinates: [" + x + ", " + y + ']');
//
//
//                break;
//            case 2:
////                System.out.println("Old Goblin Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
//                moveSouth();
//                if(y > map.dim-1){
//                    y +=2;
//                }
////                map.updateState();
////                System.out.println("New Goblin Position coordinates: [" + x + ", " + y + ']');
//
//                break;
//            case 3:
////                System.out.println("Old Goblin Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
//                moveWest();
//                if(y > map.dim-1){
//                    y -=2;
//                }
////                map.updateState();
////                System.out.println("New Goblin Position coordinates: [" + x + ", " + y + ']');
//
//                break;
//            default:
//        }
    }
}
