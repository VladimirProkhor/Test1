package MyTest1Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Animal {

    public Animal() {
        System.out.println("Yes");
    }
}
class Pets extends Animal{
    public Pets() {
        System.out.println("Not");
    }
}class Cat extends Pets {
    public Cat() {
        System.out.println("Yes,yes");
    }

    public static void createAnimals(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("все четко");
        }



        }public static void main (String[]args){
            List<Animal> animals = new ArrayList<>();
            List<Pets> pets = new ArrayList<>();
            List<Animal> cats = new ArrayList<>();

            cats.add(new Cat());
            createAnimals(cats);
    }
}