package com.ComparatorTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComporatorMain {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Collections.sort(cars);
        ComporatorMain.PrintCarsInfo(cars);

        Comparator speedComparator = new MaxSpeedCarComparator();
        Collections.sort(cars, speedComparator);

        ComporatorMain.PrintCarsInfo(cars);



    }

    static public void PrintCarsInfo(List<Car> cars){
        cars.forEach(car -> {
            System.out.println(car.getManufactureYear() + " // " + car.getModel() + " // " + car.getMaxSpeed());
        });
        System.out.println("====////====");
    }

}
