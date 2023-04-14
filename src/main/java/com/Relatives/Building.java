package com.Relatives;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Building {

    public Building() {
    }

    // класс в отношениях композиции
    private static class Apartment {

    }

    List<Apartment> apartments;

    public Parking parking = new Parking();

    public static void main(String[] args) throws CloneNotSupportedException {

        Parking parkingTest = new Parking();

        Parking parking2 = (Parking) parkingTest.clone();

        System.out.println(parking2.parkingType);
    }

}

// класс в отношениях агрегация
class Parking implements Cloneable{
    enum ParkingType {
        onGround,
        aboveGround
    }

    ParkingType parkingType = ParkingType.aboveGround;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}