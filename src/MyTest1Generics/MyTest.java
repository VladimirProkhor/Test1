package MyTest1Generics;

import java.util.ArrayList;
import java.util.List;

public class MyTest <T>{
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    private T t;


    public static <T> void  fill(List<T> list, T add) {
        for (int i = 0; i < list.size(); i++)
        list.set(i,add);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(145);
        integers.add(457);
        System.out.println(integers);
        fill(integers,45);
        System.out.println(integers);
        //////////////////////////////////////////////////////////
        MyTest<String>stringMyTest = new MyTest<>();
        stringMyTest.setT("Hello");
        stringMyTest.setT("I love life");
        System.out.println(stringMyTest.getT());
        MyTest<Integer>integerMyTest = new MyTest<>();
        integerMyTest.setT(15);
        integerMyTest.setT(478);
        System.out.println(integerMyTest.getT());
    }
}