package MyTest1Generics;

import java.util.ArrayList;

public class MyTest2<T> {
    private T value1;
    private T value2;

    public void printValue(){
        System.out.println(value1);
        System.out.println(value2);
    }
    public static <T> MyTest2<T> createAndAdd2Value(Object o1, Object o2){
        MyTest2<T> result = new MyTest2<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        Double d = 11D;
        String s = " i loh";
        MyTest2<Integer> result = createAndAdd2Value(d,s);
        result.printValue();
        ArrayList< Integer> integers = new ArrayList<>();
        ArrayList<Double>doubles = new ArrayList<>();
        boolean result1 = integers.getClass()==doubles.getClass();
            System.out.println(result1);

    }

}
