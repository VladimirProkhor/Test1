package lesson9Object;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Emploee> emploees = new ArrayList<>();
        Emploee emploee1 = new Emploee("Jon Smith", "Manager", 5, 25, 1);
        Emploee emploee2 = new Emploee("Rober Dauni", "Manager", 7, 87, 10);
        Emploee emploee3 = new Emploee("Brain Rich", "Manager", 3, 30, 2);
        Emploee emploee4 = new Emploee("Piter Parker", "Accountent", 4, 80, 3);
        Emploee emploee5 = new Emploee("Anna Smolova", "Security", 10, 110, 4);
        Emploee emploee6 = new Emploee("Albert Svem", "CTO", 15, 45, 5);
        Emploee emploee7 = new Emploee("Julia Roberts", "Expert", 14, 35, 6);
        Emploee emploee8 = new Emploee("Big Stam", "CEO", 14, 72, 7);
        Emploee emploee9 = new Emploee("Adam Relnads", "Accountent", 12, 45, 8);
        Emploee emploee10 = new Emploee("Jons Pattison", "Courier", 5, 63, 9);

//        System.out.println(emploee1.equals(emploee2));
        emploees.add(emploee1);
        emploees.add(emploee2);
        emploees.add(emploee3);
        emploees.add(emploee4);
        emploees.add(emploee5);
        emploees.add(emploee6);
        emploees.add(emploee7);
        emploees.add(emploee8);
        emploees.add(emploee9);
        emploees.add(emploee10);
//        System.out.println(emploees);
//        Emploee emploee11 = new Emploee("Jons Pattison", "Courier", 5, 63, 9);
//        будет ли считать равным поля которые переопределены в equals and HashCode объекта Emploee
//        System.out.println(emploees.contains(emploee11));
Emploee cloneEnploeens = (Emploee) emploee1.clone();
        System.out.println(cloneEnploeens.name==emploee1.name);
    }
}
