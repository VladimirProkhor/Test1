package com.javarush.test.GnericsLesson5.Garage;

;

import com.javarush.test.Gnerics.Food;
import com.javarush.test.GnericsLesson5.cars.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addCar(new ToyotaCorolla());
        garage.addCar(new HonadaCivic<com.javarush.test.Gnerics.Human>());
        garage.addCar(new LadaLargus<Food>());

        List<Car> cars = garage.getCars();
        for (int i = 0; i < cars.size(); i++) {
          cars.get(i).start();
        }
        List<HonadaCivic>honadaCivics = new ArrayList<>();
        honadaCivics.add(new HonadaCivic());
        honadaCivics.add(new HonadaCivic());
        honadaCivics.add(new HonadaCivic());
        honadaCivics.add(new HonadaCivic());
        garage.setHatchBacks(honadaCivics);
    }
    public static void collectionCopier(List<? extends Sedan>factoryList,List<? super Sedan> garageList){
        for (int i = 0; i < factoryList.size(); i++) {
            garageList.add(factoryList.get(i));
        }
    }
}
