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
//        System.out.println(map);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String playerName = scanner.nextLine();
//        System.out.println("Hi " + playerName +"!");
        var humin = new Human(0,0);
        map.addEntity(humin);
        while(gameOver == false){
            map.updateState();
            System.out.println("==============================\n" + map);
            System.out.println("In which direction would you like to move?(n,s,e,w)");
        String nextMove = scanner.nextLine();

            int oldPosX = 0;
            int oldPosY =0;
            Land newLand;
            switch (nextMove){

                case "s":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveSouth();
                    System.out.println("Old Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
                    System.out.println("New Position coordinates: [" + humin.x + ", " + humin.y + "]");

                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                break;
                case "n":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveNorth();
                    System.out.println("Old Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
                    System.out.println("New Position coordinates: [" + humin.x + ", " + humin.y + "]");
                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                break;
                case "e":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveEast();
                    System.out.println("Old Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
                    System.out.println("New Position coordinates: [" + humin.x + ", " + humin.y + "]");

                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                break;
                case "w":
                    oldPosX = humin.x;
                    oldPosY = humin.y;
                    humin.moveWest();
                    System.out.println("Old Position coordinates: [" + oldPosX + ", " + oldPosY + "]");
                    System.out.println("New Position coordinates: [" + humin.x + ", " + humin.y + "]");

                    newLand = new Land(oldPosX, oldPosY);
                    map.addTerrain(newLand);
                break;
                default:
                    System.out.println("Please enter a direction.");
            }
        }
        return null;
    }
}
