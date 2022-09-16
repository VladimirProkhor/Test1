package MyTest1Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varargs {
    @SafeVarargs
    public static <T> void add(List<T>tList, T...value){
        tList.addAll(Arrays.asList(value));
        System.out.println(tList);
    }

    public static void main(String[] args) {
        add(new ArrayList<String>(),
                "I eat",
                "I get up in seven zero,zero");
    }
}
