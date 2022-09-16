package com.javarush.test.part3;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final Wall[] walls;
    List<Furnityure > furnityureList = new ArrayList<>();

    public Room(Wall [] walls) {
       this.walls = walls;
    }
    public void addFurniture(Furnityure furnityure){
        furnityureList.add(furnityure);
    }
}
