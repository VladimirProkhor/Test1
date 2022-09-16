package com.javarush.test.family;



public class Runner {
    public static void main(String[] args) {
        Son son = new Son("Steve");
        Daddy daddy = new Daddy();
        System.out.println(daddy.name);
        System.out.println(son.name);
        son.makeFan();
        daddy.makeFan();
    }
}
