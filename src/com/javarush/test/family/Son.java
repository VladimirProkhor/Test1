package com.javarush.test.family;

public class Son extends Daddy{
    public Son(String name) {
this.name = name;
    }

    @Override
    public void shoot() {
        System.out.println("Son's shooting fast now");
    }

    @Override
    public void dance() {
        System.out.println("I,m dancing break-dance now");;
    }
}
