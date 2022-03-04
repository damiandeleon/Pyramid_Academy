package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map {


     public static int dim = 0;

     class Row {
          ArrayList<Terrain> gameRow = new ArrayList<>();
          public Row(int size, int y) {
               IntStream.range(0,size).forEach(x -> gameRow.add(new Land(x, y)));
          }

          @Override
          public String toString() {
               return String.join(" ", gameRow.stream().map(String::valueOf).collect(Collectors.toList()));
          }
     }

     ArrayList<Row> gameboard = new ArrayList<>();
     ArrayList<Humanoid> entities = new ArrayList<>();
     ArrayList<Terrain> terrains = new ArrayList<>();

     public Map addEntity(Humanoid humanoid){
          entities.add(humanoid);
          return this;
     }
     public Map addTerrain(Terrain terrain){
          terrains.add(terrain);
          return this;
     }

     public Map updateState(){
          terrains.forEach(t -> getTerrain(t.x, t.y).setState(t.toString()));
          entities.forEach(e -> getTerrain(e.x, e.y).setState(e.toString()));

          return this;
     }

     public Map(int d) {
          dim = d;
          IntStream.range(0,d).forEach(y -> gameboard.add(new Row(d, y)));
     }

     @Override
     public String toString() {
         return  String.join("\n", gameboard.stream().map(String::valueOf).collect(Collectors.toList()));
     }

     public Terrain getTerrain(int x, int y){
          return gameboard.get(x).gameRow.get(y);
     }

     public static void main(String[] args) {
          var x = new Map(5);

          var gobby = new Goblin(0,0);
          x.addEntity(gobby);
          gobby.moveSouth();

          gobby.moveSouth();

//          var humin = new Human(0,9);
//          x.addEntity(humin);


          x.updateState();
          System.out.println(x);
     }
}
