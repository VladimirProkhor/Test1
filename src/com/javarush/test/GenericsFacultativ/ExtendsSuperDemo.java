package com.javarush.test.GenericsFacultativ;

import java.sql.Array;
import java.util.*;

public class ExtendsSuperDemo {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>(Arrays.asList(1, 3, 10, 20, Integer.MAX_VALUE, Integer.MAX_VALUE - 1));

        Set<Double> doubles = new HashSet<>(Arrays.asList(1.0, 2d, 10d, 20d, Double.MAX_VALUE, Double.MAX_VALUE - 1));

        Set<Long> longs = new HashSet<>(Arrays.asList(1L, 2L, 10L, 20L, Long.MAX_VALUE, Long.MAX_VALUE - 1));

        Set<Float> foFloats = new HashSet<>(Arrays.asList(1f, 2f, 10f, 20f, Float.MAX_VALUE, Float.MAX_VALUE - 1));
        @SuppressWarnings("unchecked") Set<Number> union = getUnoin(integers,doubles,longs,foFloats);
        System.out.println(union);
    }
// означаетБчто не будет проверятся типо-безопасность vararg
    @SuppressWarnings("unchecked")
    //запись vararg чтобы исп несколько типов..sets - это producer от него мы можем получить инф , а изменить и записать нет
    private static Set<Number> getUnoin(Set<? extends Number>...sets) {
        //PECS!!!
        Comparator<Number>objectComparator = (o1, o2) -> o1.longValue()==o2.longValue() && o1.doubleValue()==o2.doubleValue()?
                0:o1.longValue()<o2.longValue() || o1.doubleValue()<o2.doubleValue()?-1:1;
        //сделали комопоратор чтобы сраванить каждый объект
      Set<Number>numbers = new TreeSet<>(objectComparator);
        for (Set<? extends Number> set : sets) {
            numbers.addAll(set);
        }
        return numbers;
    }
//    private static Set<Number> getCross(Set<? extends Number>...sets) {
//        //PECS!!!
//        Comparator<Number>objectComparator = (o1, o2) -> o1.longValue()==o2.longValue() && o1.doubleValue()==o2.doubleValue()?
//                0:o1.longValue()<o2.longValue() || o1.doubleValue()<o2.doubleValue()?-1:1;
//        //сделали комопоратор чтобы сраванить каждый объект
//        Set<Number>numbers = new HashSet<>();
//        for (Number number1 : sets[0]) {
//            boolean found = true;
//            for (Set<? extends Number> set : sets) {
//                for (Number number2 : set) {
//                    objectComparator.compare(number1,number2)!=0){
//
//                    }
//                }
//            }
//        }
//        for (Set<? extends Number> set : sets) {
//            numbers.addAll(set);
//        }
//        return numbers;
//    }
    }
