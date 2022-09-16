package com.javarush.test.GnericsLesson5.cars;

import java.util.ArrayList;
import java.util.List;

public abstract class Car<T> {
    T name;
    //в параметрах прописали информацию об объекте с параметром Т
    public void testClimate(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        List<T> entities = new ArrayList<>();
        //создали объкт нашего класс Т и записали в List
        T entity = clazz.newInstance();
         entities.add(entity);
    }

    public void start(){

    }
    public void stop(){

    }
    public void getUp(){

    }
    public void gearDown(){

    }
}
