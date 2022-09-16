package MyTest1Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class lesson6 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
//
//        Map<String, String> result = list.stream()
//                .map( e -> e.split("=") )
//                .filter( e -> e.length == 2 )
//                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );
//        System.out.println(result);
        ArrayList<String> nameList = new ArrayList<>();
        nameList .add("Elena");
        nameList .add("John");
        nameList .add("Alex");
        nameList .add("Jim");
        nameList .add("Sara");

        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());
    }
    }

