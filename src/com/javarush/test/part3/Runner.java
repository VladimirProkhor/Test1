package com.javarush.test.part3;

public class Runner {
    public static void main(String[] args) {
        Room room = new Room(new Wall[4]);
        Furnityure chair = new Furnityure("Стул");
        room.addFurniture(chair);
    }

}
