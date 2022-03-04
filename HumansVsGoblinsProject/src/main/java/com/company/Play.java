package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    boolean gameOver = false;

    public Object play(){
        //Print out introduction
        System.out.println("==========================================");
        System.out.println("  Welcome to Human vs. Goblin Simulator  ");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("How to Play:");
        System.out.println("============");
        System.out.println("You \uD83E\uDD35 and a Goblin 👺 will share the game space.  ");
        System.out.println("You will start on the opposite side from the Goblin. You will be asked to move in a direction. \n" +
                "North (n)\n" +
                "South (s)\n" +
                "East (e)\n" +
                "West (w)\n" +
                "" +
                "The Goblin might follow you around.  If you and the Goblin collide, you will engage in battle and die!\n" +
                "Try to avoid the Goblin!");
        Map map = new Map(5);
        var gobby = new Goblin(4,4);
        map.addEntity(gobby);
        map.updateState();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hi " + playerName +"!");
        var humin = new Human(0,0);
        map.addEntity(humin);
        while(gameOver == false){

            map.updateState();
            System.out.println("================\n" + map);
            System.out.println("In which direction would you like to move?(n,s,e,w)");
        String nextMove = scanner.nextLine();

            int oldPosX = 0;
            int oldPosY =0;
            Land newLand;
            Land newLand2;
            switch (nextMove){

                case "s":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveSouth();
                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                    newLand2 = new Land(gobby.x, gobby.y);
                    gobby.moveGoblin(gobby.x, gobby.y, humin.x, humin.y);
                    map.addTerrain(newLand2);
                    if(humin.x == gobby.x && humin.y == gobby.y){
                        gameOver = true;
                    }
                break;
                case "n":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveNorth();
                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                    newLand2 = new Land(gobby.x, gobby.y);
                    gobby.moveGoblin(gobby.x, gobby.y, humin.x, humin.y);
                    map.addTerrain(newLand2);
                    if(humin.x == gobby.x && humin.y == gobby.y) {
                        gameOver = true;
                    }
                break;
                case "e":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveEast();
                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                    newLand2 = new Land(gobby.x, gobby.y);
                    gobby.moveGoblin(gobby.x, gobby.y, humin.x, humin.y);
                    map.addTerrain(newLand2);
                    if(humin.x == gobby.x && humin.y == gobby.y) {
                        gameOver = true;
                    }
                break;
                case "w":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveWest();
                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                    newLand2 = new Land(gobby.x, gobby.y);
                    gobby.moveGoblin(gobby.x, gobby.y, humin.x, humin.y);
                    map.addTerrain(newLand2);
                    if(humin.x == gobby.x && humin.y == gobby.y){
                        gameOver = true;}
                break;

                default:
                    System.out.println("******************************\n" + "Please enter a direction.\n" + "******************************");
                    newLand2 = new Land(gobby.x, gobby.y);
                    gobby.moveGoblin(gobby.x, gobby.y, humin.x, humin.y);
                    map.addTerrain(newLand2);
                    if(humin.x == gobby.x && humin.y == gobby.y) {
                        gameOver = true;
                    }
            }
        }
        System.out.println("So sorry. " + playerName + ". You died.... wah wah wahhhhhhhhh... ");
        return null;
    }
}
