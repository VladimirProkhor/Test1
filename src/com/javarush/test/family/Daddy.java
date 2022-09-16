package com.javarush.test.family;

public class Daddy {
    public String name =" John";

    public void eat(){
        System.out.println(" I,m eating now");

    }
    public void shoot(){
        System.out.println("Daddy's shooting now");

    }
    public void dance(){
        System.out.println("I,m dancing polka now");
    }
    public void makeFan(){
        System.out.println("Daddy's making fun");
        dance();
    }
    public void printName(){
        System.out.println(name);
    }
}
