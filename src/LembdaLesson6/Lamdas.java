package LembdaLesson6;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lamdas {
    public static void main(String[] args) {
//        List<String>emploees = Arrays.asList("Иванов","Петров", "Васильев","Прохоров");
        List<Enploee> workers = new ArrayList<>();
        workers.add(new Enploee("Иванов", 23));
        workers.add(new Enploee("Петров", 44));
        workers.add(new Enploee("Васильев", 57));
        workers.add(new Enploee("Прохоров", 7));

        List<Integer>integers =Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Преобразуем коллекцию в поток
        Stream<Integer>integerStream =integers.stream();
        // второй способ создания стрим, значания сразу помещаем в стрим
        Stream<String>stream = Stream.of("Один","Два","Три","Три","Четыре");
        // третий способо создания стрим, после iterate  мы указываем объект и потом ,что мы будем делать с ним
        Stream<Integer> stream1 = Stream.iterate(1,n -> n + 3);
        //фильтруем числа, если / 2 != 0 Б то оставлем число, метод collect-преобразует в коллекцию
         List<Integer>integers1 = integerStream.filter(o -> o%2!=0).collect(Collectors.toList());
         List<String>strings = stream
                 .filter(o -> o.length()>3)
             //distinct - удаляет дубликаты
                         .distinct()
                                 .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println(strings);



//        Boogalter boogalter = new Boogalter();
//        List<String>listForSalary = new ArrayList<>();
//        for (Enploee worker : workers) {
//            listForSalary.add(worker.getFormat((s1,s2) -> s1 + "_/^" + s2));
//            listForSalary.add(worker.getFormat(boogalter::makeFormat));
//

//        }
//        System.out.println(listForSalary);
//

//        Comparator<Enploee>comparator = (o1, o2) -> {
//            int len1 =o1.getName().length();
//            int len2 =o2.getName().length();
//          // сортируем по длине имени.
//            return len1- len2;
//        };
//      Collections.sort(workers, comparator);
//
//        workers.forEach(System.out::println);
//        System.out.println(workers);
//
    }
}