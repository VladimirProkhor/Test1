package Lesson8Loader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLData;



public class LoaderDemo {
    static {
        try {
////            to create class String но самого класса нигде нет. С помощью такого кода можно загружать любые классы при этом приложение не знает про них или появиться динамически
            Class<?>aClass = Class.forName("java.lang.String");
            Constructor<?> constructor = aClass.getConstructor(aClass);
            Object customString = constructor.newInstance("I loader before main method");
            System.out.println(customString);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Class<?>[] aClass = {
                SQLData.class,
                LoaderDemo.class,
                int.class,
                Object.class,
        };
        for (Class<?> aClass1 : aClass) {
            showDetails(aClass1);
        }
        Class<LoaderDemo> loaderDemoClass = LoaderDemo.class;
        ClassLoader classLoader = loaderDemoClass.getClassLoader();
        ClassLoader parent = classLoader.getParent();
        ClassLoader parent1 = parent.getParent();
        System.out.println(loaderDemoClass);
        System.out.println(classLoader);
        System.out.println(parent);
        System.out.println(parent1);
        System.out.println("_".repeat(50));
    }
    private static void showDetails(Class <?> aClass){
        Package aPackage = aClass.getPackage();
        String name = aClass.getName();
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.printf("loader: %s%n class: %s%n %s%n%n",
                classLoader,name,aPackage);

    }

}
