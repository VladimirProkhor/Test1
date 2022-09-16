package com.javarush.test.GnericsLesson5.Garage;



import com.javarush.test.GnericsLesson5.cars.Car;
import com.javarush.test.GnericsLesson5.cars.Hatcback;
import com.javarush.test.GnericsLesson5.cars.Sedan;
import com.javarush.test.GnericsLesson5.cars.Wagon;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Car> cars ;
    List<Sedan> sedans ;
    List<Hatcback> hatchBacks ;
    List<Wagon> wagons ;

    public Garage() {
        this.cars  =new ArrayList<>();
        this.sedans =new ArrayList<>();
        this.hatchBacks = new ArrayList<Hatcback>();
        this.wagons = new ArrayList<Wagon>();
    }
    public void setSedans(List<Sedan>sedans){
        this.sedans = sedans;
    }
    public void setHatchBacks(List<? extends     Hatcback>hatchBacks){
        this.hatchBacks = (List<Hatcback>) hatchBacks;
    }
    public void setWagons(List<Wagon>wagons){
        this.wagons = wagons;
    }

    public void addCar(Car object){
        cars.add(object);
    }
    public List getCars(){
        return cars;
    }
}
